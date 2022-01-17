package Problem1;

public class Plumbing extends AbstractSpecialist {
  private static final int PERMITTING_FEE = 20;

  public Plumbing(int numOfLicEmployees, boolean isComplex,Property serviceLocation, boolean isMonthly){
    super(numOfLicEmployees, isComplex, serviceLocation, isMonthly);

}
  /**
   *Calculates the total price of the Service
   * @return price
   */

  @Override
  public double calculatePrice() {
    return getBaseRate() + PERMITTING_FEE;
  }


  @Override
  public String toString() {
    return "Plumbing{" + super.toString();
  }

}
