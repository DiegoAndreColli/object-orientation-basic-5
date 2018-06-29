/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.orientation.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class SalePricingDataSource {

    private final Map<String, Double> dataDouble = new HashMap<>();
    private final Map<String, String> dataString = new HashMap<>();

    public SalePricingDataSource() {
        dataString.put("product.bonus.product", "aspirin");
        dataDouble.put("product.bonus.threshold", 12d);
        dataDouble.put("elderly.percent.percentage", 12d);
        dataDouble.put("absolute.over.threshold.discount", 12d);
        dataDouble.put("absolute.over.threshold.threshold", 12d);
    }

    public Double get(String key) {
        return dataDouble.get(key);
    }
    
    public String getString(String key){
        return dataString.get(key);
    }

}
