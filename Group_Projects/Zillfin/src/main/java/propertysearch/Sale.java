package propertysearch;

/**
 * Class Sale represents a Sale contract.
 */
public class Sale extends AbstractContract {

  /**
   * Constructor for Sale.
   *
   * @param askingPrice The asking price.
   * @param negotiable  Is the asking price negotiable.
   */
  public Sale(Double askingPrice, Boolean negotiable) throws NegativeNumberException {
    super(askingPrice, negotiable);
  }

  @Override
  public String toString() {
    return "Sale{} " + super.toString();
  }
}
