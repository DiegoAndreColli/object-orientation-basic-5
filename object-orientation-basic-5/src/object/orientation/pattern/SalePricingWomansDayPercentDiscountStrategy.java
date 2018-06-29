/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.orientation.pattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class SalePricingWomansDayPercentDiscountStrategy implements SalePricingStrategy {

    private final Double percentage;

    public SalePricingWomansDayPercentDiscountStrategy(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public Double getTotal(Sale sale) {
        Double saleTotal = sale.getPreDiscountTotal();
        if (sale.getCustomer().isWoman()) {
            String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM"));
            if (now.equals("08-03"))
                return saleTotal - (saleTotal * percentage);
        }

        return saleTotal;
    }
}
