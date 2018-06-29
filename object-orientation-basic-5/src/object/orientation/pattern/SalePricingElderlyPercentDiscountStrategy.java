/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.orientation.pattern;

/**
 *
 * @author User
 */
public class SalePricingElderlyPercentDiscountStrategy implements SalePricingStrategy {

    private final Double percentage;

    public SalePricingElderlyPercentDiscountStrategy(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public Double getTotal(Sale sale) {
        Double saleTotal = sale.getPreDiscountTotal();
        if (sale.getCustomer().isElderly()) {
            return saleTotal - (saleTotal * percentage);
        }
        return saleTotal;
    }
}
