package Problem1;

import java.util.Objects;

/**
 * Represents the Gardening
 */
public class Gardening extends AbstractExterior {

  private final static int WASTE_REMOVAL_FEE = 20;

  /**
   * Constructor for the Gardening class
   * @param serviceLocation -tell whether a property size is small medium or large.
   * @param isMonthly -- boolean of true for if a monthly subscription exist false otherwise.
   */
  public Gardening(Property serviceLocation, boolean isMonthly) {
    super(serviceLocation, isMonthly);

  }
  /**
   *Calculates the total price of the Service
   * @return price
   */
  @Override
  public double calculatePrice() {
    int numHours = getServicesHour();
    return WASTE_REMOVAL_FEE + (getBaseRate() * numHours) * getDiscountRate();

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Gardening gardening = (Gardening) o;
    return WASTE_REMOVAL_FEE == gardening.WASTE_REMOVAL_FEE;
  }

  @Override
  public int hashCode() {
    return Objects.hash(WASTE_REMOVAL_FEE);
  }

  @Override
  public String toString() {
    return "Gardening " +
        "WASTE_REMOVAL_FEE=" + WASTE_REMOVAL_FEE + " " + super.toString();
  }
}
