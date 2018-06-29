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
public class SalePricingStrategyFactory {

    public static SalePricingStrategy getInstance(Sale sale){

        //no discount
        return d -> d.getTotal();
    }
    
    private static SalePricingStrategy getSalePricingProductBonusStrategy(String product, Double threshold){
        return new SalePricingProductBonusStrategy(product, threshold);
    }
    
    private static SalePricingStrategy getSalePricingPercentDiscountStrategy(Double percentage){
        return new SalePricingElderlyPercentDiscountStrategy(percentage);
    }
    
    private static SalePricingStrategy getSalePricingAbsoluteDiscountOverThresholdStrategy(Double discount, Double threshold){
        return new SalePricingAbsoluteDiscountOverThresholdStrategy(discount, threshold);
    }
}
