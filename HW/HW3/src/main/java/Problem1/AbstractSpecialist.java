package Problem1;

import java.util.Objects;

/**
 * Represents Services that require employees with specific qualifications or licenses.
 */
public abstract class AbstractSpecialist extends AbstractService {
  protected int numOfLicEmployees; // req min 1
  protected boolean isComplex; //req 2e for s/m , req 3e for l
  private static final int BASE_RATE = 200;
  private static final int  MIN_NUM_OF_EMPLOYEES = 1;

  /**
   *Constructor for the Abstract Specialist class
   * @param numOfLicEmployees - number of licensed employees.
   * @param isComplex - boolean whether the service is complex
   * @param serviceLocation -ell whether a property size is small medium or large.
   * @param isMonthly -boolean of true for if a monthly subscription exist false otherwise.
   */
  public AbstractSpecialist(int numOfLicEmployees, boolean isComplex, Property serviceLocation, boolean isMonthly) {
    super(serviceLocation, isMonthly);
    this.isComplex = isComplex;
    this.numOfLicEmployees = numOfLicEmployees;
    this.validateEmployeeNum();
  }

  /**
   * Gets the baseRate
   * @return baseRate
   */
  public int getBaseRate() {
    return BASE_RATE * numOfLicEmployees;
  }

  /**
   * Validates number of employees. By checking number of license employee size and property size
   */
  public final void validateEmployeeNum() {
    if (this.numOfLicEmployees < MIN_NUM_OF_EMPLOYEES) {
      this.numOfLicEmployees = MIN_NUM_OF_EMPLOYEES;
    }

    if (!isComplex){
      return;
    }

    PropertySize size = serviceLocation.getSize();

    if (size==PropertySize.SMALL || size == PropertySize.MEDIUM){
      if (this.numOfLicEmployees < 2){
        this.numOfLicEmployees = 2;
      }
    }else if (size ==PropertySize.LARGE) {
      if (this.numOfLicEmployees < 3){
        this.numOfLicEmployees = 3;
      }
    }
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
    AbstractSpecialist that = (AbstractSpecialist) o;
    return numOfLicEmployees == that.numOfLicEmployees && isComplex == that.isComplex;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), numOfLicEmployees, isComplex);
  }

  @Override
  public String toString() {
    return "AbstractSpecialist{" +
        "numOfLicEmployees=" + numOfLicEmployees +
        ", isComplex=" + isComplex +
        '}';
  }
}
