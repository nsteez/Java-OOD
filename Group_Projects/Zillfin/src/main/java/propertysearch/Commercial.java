package propertysearch;

import java.util.Objects;

/**
 * Represents a commercial property.
 */
public class Commercial extends AbstractProperty{
  private Integer numOfOffices;
  private Boolean isSuitableForRetail;

  /**
   * Constructor for the Commercial class.
   *
   * @param address - address
   * @param size - size
   * @param numOfOffices - number of offices
   * @param isSuitableForRetail - boolean check for if property is suitable for Retail
   * @throws NegativeNumberException - if number is below zero
   */
  public Commercial(String address, Integer size, Integer numOfOffices, Boolean isSuitableForRetail)
      throws NegativeNumberException {
    super(address, size);
    validateSize(numOfOffices);
    this.numOfOffices = numOfOffices;
    this.isSuitableForRetail = isSuitableForRetail;
  }

  /**
   * Gets number of offices
   *
   * @return number of offices
   */
  public Integer getNumOfOffices() {
    return this.numOfOffices;
  }

  /**
   * Checks whether its suitable for retail
   *
   * @return true or false
   */
  public Boolean getSuitableForRetail() {
    return this.isSuitableForRetail;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Commercial that = (Commercial) o;
    return Objects.equals(this.numOfOffices, that.numOfOffices) && Objects
        .equals(this.isSuitableForRetail, that.isSuitableForRetail);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), this.numOfOffices, this.isSuitableForRetail);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "Commercial{" +
        "numOfOffices=" + this.numOfOffices +
        ", isSuitableForRetail=" + this.isSuitableForRetail +
        "} " + super.toString();
  }
}
