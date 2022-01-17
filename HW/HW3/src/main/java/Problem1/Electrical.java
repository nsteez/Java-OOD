package Problem1;

import java.util.Objects;

/**
 * A Specialist service that requires licenced employees.
 */
public class Electrical extends AbstractSpecialist {

  private static final int MAX_LICENSE_EMPLOYEES = 4; // max number of employees permitted to work
  private static final int PERMITTING_FEE = 50; // am electrical fee

  /**
   * Constructs an Electrical Service
   * @param numOfLicEmployees - number of licensed employees
   * @param isComplex - boolean of whether a specialist service is complex or not.
   * @param serviceLocation - tell whether a property size is small medium or large.
   * @param isMonthly - boolean of true for if a monthly subscription exist false otherwise.
   * @throws MaxEmployeeException - if employees needed is over max of 4
   */
  public Electrical(int numOfLicEmployees, boolean isComplex, Property serviceLocation, boolean isMonthly) throws MaxEmployeeException{
    super(numOfLicEmployees, isComplex, serviceLocation, isMonthly);
    this.validateMaxEmployees();
  }

  /**
   * Validates if number of employees
   * @throws MaxEmployeeException -  if employees needed is over max of 4
   */
  public final void validateMaxEmployees() throws MaxEmployeeException{
    if(this.numOfLicEmployees > MAX_LICENSE_EMPLOYEES){
      throw new MaxEmployeeException();
    }
  }
  /**
   *Calculates the total price of the Service
   * @return price
   */
  @Override
  public double calculatePrice() {
    return this.getBaseRate()  + PERMITTING_FEE;
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
    Electrical that = (Electrical) o;
    return PERMITTING_FEE == that.PERMITTING_FEE;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), PERMITTING_FEE);
  }

  @Override
  public String toString() {
    return "Electrical{" +
        "PERMITTING_FEE=" + PERMITTING_FEE +
        '}' + " " + super.toString();
  }
}
