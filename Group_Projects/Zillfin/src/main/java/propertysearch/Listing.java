package propertysearch;

import java.util.Objects;

/**
 * Class Listing representing a real estate Listing.
 *
 * @param <T> Generic object T represents either a Residential of Commercial property.
 * @param <U> Generic object U represents either a Sale or Rental contract.
 */
public class Listing<T extends AbstractProperty, U extends AbstractContract> {

  private T property;
  private U contract;

  /**
   * @param property The property associated with the Listing.
   * @param contract The contract pertaining to the Listing.
   */
  public Listing(T property, U contract) {
    this.property = property;
    this.contract = contract;
  }

  /**
   * @return The property of the Listing.
   */
  public T getProperty() {
    return this.property;
  }

  /**
   * @return The contract of the Listing.
   */
  public U getContract() {
    return this.contract;
  }

  /**
   * @return A unique string concatenation of the Listing.
   */
  @Override
  public String toString() {
    return "Listing{" +
        "property=" + this.property +
        ", contract=" + this.contract +
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
    if (!(o instanceof Listing)) {
      return false;
    }
    Listing<?, ?> listing = (Listing<?, ?>) o;
    return this.property.equals(listing.property) && this.contract.equals(listing.contract);
  }

  /**
   * @return A unique hashCode pertaining to this Listing.
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.property, this.contract);
  }
}
