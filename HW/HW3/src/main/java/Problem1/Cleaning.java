package Problem1;

/**
 * Represents an Interior Cleaning Service
 */
public class Cleaning extends AbstractInterior {

  /**
   * Constructor for the Cleaning class.
   * @param serviceLocation -tell whether a property size is small medium or large.
   * @param isMonthly -boolean of true for if a monthly subscription exist false otherwise.
   */
  public Cleaning(Property serviceLocation, boolean isMonthly) {
    super(serviceLocation, isMonthly);
  }

  /**
   *Calculates the total price of the Service
   * @return price
   */
  @Override
  public double calculatePrice() {
    return this.getInteriorPetServiceFee() * this.hours * getDiscountRate();

  }

  @Override
  public String toString() {
    return "Cleaning{" + super.toString();
  }
}
