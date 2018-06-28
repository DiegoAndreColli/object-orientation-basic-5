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
public class SalePricingAbsoluteDiscountOverThresholdStrategy implements SalePricingStrategy {

    private final Double discount;
    private final Double threshold;

    public SalePricingAbsoluteDiscountOverThresholdStrategy(Double discount, Double threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    @Override
    public Double getTotal(Sale sale) {
        Double saleTotal = sale.getTotal();

        if (saleTotal > threshold)
            return saleTotal - discount;

        return saleTotal;
    }
}
