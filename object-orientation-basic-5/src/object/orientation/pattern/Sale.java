package object.orientation.pattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Sale {

    private Customer customer;
    private List<SaleLine> lines;

    public Double getFinalTotal() {
        Double total = getTotal();
        return  total - getDiscount(total);
    }

    public Double getTotal() {
        Double total = 0.0;
        for (SaleLine line : lines) {
            total += line.getQuantity() * line.getItem().getValue();
        }
        return total;
    }

    public Double getDiscount(Double total) {        
        if(customer.isWoman())
        {
            String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM"));
            if (now.equals("08-03"))
                return total * 0.10;
        }
        
        if(customer.isElderly())
            return total * 0.05;
        
        if(total > 100.0)
            return 15.0;
        
       
        List<SaleLine> condition = lines.stream()
                .filter(l -> "aspirin".equals(l.getItem().getName()) && l.getQuantity() > 3)
                .collect(Collectors.toList());
        
        
        
        return 0.0;
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
