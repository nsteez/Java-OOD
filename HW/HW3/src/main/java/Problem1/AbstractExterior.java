package Problem1;

/**
 * Represents Services done outside the home.
 */
public abstract class AbstractExterior extends AbstractNonSpecialist {

  /**
   * Constructor for AbstractExterior class.
   * @param serviceLocation - tell whether a property size is small medium or large.
   * @param isMonthly - boolean of true for if a monthly subscription exist false otherwise.
   */
  public AbstractExterior(Property serviceLocation, boolean isMonthly){
    super(serviceLocation, isMonthly);
  }
}
