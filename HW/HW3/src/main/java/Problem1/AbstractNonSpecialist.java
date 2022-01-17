package Problem1;

import java.util.Objects;
/**
 *Represents All non-specialist Services
 */
public abstract class AbstractNonSpecialist extends AbstractService {

  protected int hours;
  private static final int BASE_RATE = 80;

  /**
   *Constructor for the AbstractNonSpecialist class.
   * @param serviceLocation -tell whether a property size is small medium or large.
   * @param isMonthly - boolean of true for if a monthly subscription exist false otherwise.
   */
  public AbstractNonSpecialist(Property serviceLocation, boolean isMonthly){
    super(serviceLocation, isMonthly);
    PropertySize size = this.serviceLocation.getSize();
    if (size == PropertySize.SMALL) {
      this.hours = 1;

    } else if (size == PropertySize.MEDIUM) {
      this.hours = 2;
    } else if (size == PropertySize.LARGE) {
      this.hours = 4;
    }else {
      this.hours = 0;
    }
  }

  /**
   * Calculates the base rate for the service
   * @return BASE_RATE
   */
  public int getBaseRate(){
    return BASE_RATE;
  }
  /**
   * Gets Service Hours
   * @return total service hours.
   */
  public int getServicesHour() {
    return this.hours;
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
    AbstractNonSpecialist that = (AbstractNonSpecialist) o;
    return hours == that.hours;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hours);
  }

  @Override
  public String toString() {
    return "AbstractNonSpecialist{" +
        "hours=" + hours +
        '}';
  }
}
