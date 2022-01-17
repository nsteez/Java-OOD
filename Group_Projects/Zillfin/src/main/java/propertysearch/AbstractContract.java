package propertysearch;

import java.util.Objects;

/**
 * Abstract class representing a contract.
 */
public abstract class AbstractContract {

  protected Double askingPrice;
  protected Boolean negotiable;
  private static final Double MINIMUM_PRICE = 0.0;

  /**
   * Constructor for AbstractContract
   *
   * @param askingPrice The asking price.
   * @param negotiable  Is the asking price negotiable.
   */
  public AbstractContract(Double askingPrice, Boolean negotiable) {
    validatePrice(askingPrice);
    this.askingPrice = askingPrice;
    this.negotiable = negotiable;
  }

  /**
   * Validates the given price value
   *
   * @param price the given price value
   * @throws NegativeNumberException if the price is negative
   */
  private void validatePrice(Double price) throws NegativeNumberException {
    if (price < MINIMUM_PRICE) {
      throw new NegativeNumberException();
    }
  }

  /**
   * @return The asking price.
   */
  public Double getAskingPrice() {
    return this.askingPrice;
  }

  /**
   * @return True if negotiable, False if not negotiable.
   */
  public Boolean getNegotiable() {
    return this.negotiable;
  }

  /**
   * Returns the total value of the contract
   *
   * @return the total value of the contract
   */
  public Double getValue() {
    return this.askingPrice;
  }

  /**
   * @return Unique string concatenation of this AbstractContract.
   */
  @Override
  public String toString() {
    return "AbstractContract{" +
        "askingPrice=" + this.askingPrice +
        ", negotiable=" + this.negotiable +
        '}';
  }

  /**
   * @param o An object for comparison.
   * @return True for equal, False for not equal.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AbstractContract)) {
      return false;
    }
    AbstractContract that = (AbstractContract) o;
    return this.askingPrice.equals(that.askingPrice) && this.negotiable.equals(that.negotiable);
  }

  /**
   * @return A unique hashCode for this AbstractContract.
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.askingPrice, this.negotiable);
  }
}
