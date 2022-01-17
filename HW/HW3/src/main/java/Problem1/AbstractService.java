package Problem1;

import java.util.Objects;
/**
 * Represents all Services for company
 */
public abstract class AbstractService implements Services {

  protected Property serviceLocation;
  protected boolean isMonthly;

  /**
   *
   * @param serviceLocation -tell whether a property size is small medium or large.
   * @param isMonthly - boolean of true for if a monthly subscription exist false otherwise.
   */
  public AbstractService(Property serviceLocation, boolean isMonthly) {
    this.serviceLocation = serviceLocation;
    this.isMonthly = isMonthly;

  }

  /**
   * Gets the serviceLocation
   * @return -serviceLocation
   */
  public Property getServiceLocation() {
    return this.serviceLocation;
  }

  /**
   * Gets the monthly discount.
   * @return boolean of monthly discount.
   */
  protected boolean getMonthlyDiscount() {
    return this.isMonthly;
  }

  /**
   * Gets the discount rate. For either 10th service discount or monthly discount.
   * @return
   */
  double getDiscountRate() {
    boolean discount;
    discount = serviceLocation.tenthServiceDiscount();
    if (discount == true) {
      return .5;
    }
    discount = getMonthlyDiscount();
    if (discount == true) {
      return 0.9;
    }return 1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractService that = (AbstractService) o;
    return isMonthly == that.isMonthly && Objects
        .equals(serviceLocation, that.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLocation, isMonthly);
  }

  @Override
  public String toString() {
    return "AbstractService{" +
        "serviceLocation=" + serviceLocation +
        ", isMonthly=" + isMonthly +
        '}';
  }
}