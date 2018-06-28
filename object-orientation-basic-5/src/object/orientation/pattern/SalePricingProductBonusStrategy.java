/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.orientation.pattern;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class SalePricingProductBonusStrategy implements SalePricingStrategy {

    private final String product;
    private final Double threshold;

    public SalePricingProductBonusStrategy(String product, Double threshold) {
        this.product = product;
        this.threshold = threshold;
    }

    @Override
    public Double getTotal(Sale sale) {
        Double discount = 0.0;
        List<SaleLine> aspirinLines = sale.getLines().stream()
                .filter(l -> product.equals(l.getItem().getName()) && l.getQuantity() > threshold)
                .collect(Collectors.toList());
        if (!aspirinLines.isEmpty()) {
            for (SaleLine aspirinLine : aspirinLines) {
                double quantity = aspirinLine.getQuantity() / threshold;
                long round = (long) quantity;
                discount += round * aspirinLine.getItem().getValue();
            }
        }
        return sale.getTotal() - discount;
    }

}
