package object.orientation.basic.examples;

import java.util.ArrayList;
import java.util.List;
import object.orientation.basic.Customer;
import object.orientation.basic.Product;
import object.orientation.basic.ProductionOrder;
import object.orientation.basic.OrderLine;

/**
 *
 * @author User
 */
public class SaleFactory {

    public static ProductionOrder getRegularSale() {
        ProductionOrder sale = new ProductionOrder();
        sale.setCustomer(new Customer("123456789", "Willian Oak", 60 ));
        sale.setLines(getItens());        
        return sale;
    }

    public static ProductionOrder getAncientSale() {
        ProductionOrder sale = new ProductionOrder();
        sale.setCustomer(new Customer("987654321", "Thomaz Franz", 90 ));
        sale.setLines(getItens());        
        return sale;
    }
    
    private static List<OrderLine> getItens() {
        List<OrderLine> list = new ArrayList<>();
        list.add(new OrderLine(new Product("Bread", 0.20), 10));
        list.add(new OrderLine(new Product("Lamp", 2.20), 7));
        list.add(new OrderLine(new Product("Bicycle", 8000d), 1));
        list.add(new OrderLine(new Product("Toothpaste", 5d), 3));
        return list;
    }

}
