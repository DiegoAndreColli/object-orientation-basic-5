package object.orientation.basic;

import object.orientation.basic.examples.SaleFactory;

/**
 *
 * @author User
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductionOrder sale1 = SaleFactory.getRegularSale();
        CashRegister.sell(sale1);
        
        ProductionOrder sale2 = SaleFactory.getAncientSale();
        CashRegister.sell(sale2);
    }

}
