/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.orientation.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SalePricingCompositeBestForCustomerStrategy implements SalePricingCompositeStrategy{

    private final List<SalePricingStrategy> strategies = new ArrayList<>(); 
    
    @Override
    public void add(SalePricingStrategy strategy) {
        strategies.add(strategy);
    }

    @Override
    public Double getTotal(Sale sale) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
