package object.orientation.pattern;

import java.util.List;

/**
 *
 * @author User
 */
public class Sale {
    
    private Customer customer;
    private List<SaleLine> lines;
    private SalePricingStrategy pricingStrategy;
    
    public Double getTotal() {
        return pricingStrategy.getTotal(this);
    }
    
    public Double getPreDiscountTotal() {
        Double total = 0.0;
        for (SaleLine line : lines) {
            total += line.getQuantity() * line.getItem().getValue();
        }
        return total;
    }
    
    public List<SaleLine> getLines() {
        return lines;
    }
    
    public void setLines(List<SaleLine> lines) {
        this.lines = lines;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
