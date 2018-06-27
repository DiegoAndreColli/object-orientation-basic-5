package object.orientation.pattern;

/**
 *
 * @author User
 */
public interface PricingStrategy {
    Double getTotal(Sale sale);
}
