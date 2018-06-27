package object.orientation.pattern;

import java.util.List;

/**
 *
 * @author User
 */
public class Sale {
    private List<SaleLine> lines;
    private PricingStrategy strategy;
    
    public Double getTotal(){
        return strategy.getTotal(this);
    }

    public List<SaleLine> getLines() {
        return lines;
    }

    public void setLines(List<SaleLine> lines) {
        this.lines = lines;
    }
    
}
