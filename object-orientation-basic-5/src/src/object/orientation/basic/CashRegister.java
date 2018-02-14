package object.orientation.basic;

import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class CashRegister {

    public static void sell(ProductionOrder sale){

        calculateTransaction(sale);

        DecimalFormat df = new DecimalFormat("0.00");

        String welcome = String.format("%45s", "Welcome");
        String headers = String.format("%-40s", "Product")
                .concat(String.format("%15s", "Price"))
                .concat(String.format("%15s", "Quantity"))
                .concat(String.format("%15s", "Total"));
        String lines = getSaleBody(sale, df);
        String total = String.format("%-70s", "Total: ")
                .concat(String.format("%15s", df.format(sale.getTotal())));
        String totalWithDiscounts = String.format("%-70s", "Final Total: ")
                .concat(String.format("%15s", df.format(sale.getValueToPay())));

        String finalString = welcome.concat("\n")
                .concat(headers).concat("\n")
                .concat(lines).concat("\n")
                .concat(total).concat("\n")
                .concat(totalWithDiscounts);

        show(finalString);
    }

    private static void calculateTransaction(ProductionOrder sale){
        sale.calcTotal();
        sale.calcDiscounts();
    }

    private static String getSaleBody(ProductionOrder sale, DecimalFormat df){
        StringBuilder lines = new StringBuilder();
        for (OrderLine line : sale.getLines()) {
            lines.append(
                       String.format("%-40s", line.getProduct().getName())
               .concat(String.format("%15s", df.format(line.getProduct().getPrice())))
               .concat(String.format("%15s", line.getQuantity()))
               .concat(String.format("%15s", df.format(line.getLineTotal())))
               .concat("\n")
            );
        }

        return lines.toString();
    }

    private static void show(String string){
        System.out.println(string);
    }
}