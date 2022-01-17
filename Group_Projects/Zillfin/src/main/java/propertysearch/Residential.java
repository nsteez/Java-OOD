package propertysearch;

import java.util.Objects;

/**
 * Represents a Residential property.
 */
public class Residential extends AbstractProperty{
  private Integer numOfBedrooms;
  private Double numOfBathrooms;

  /**
   * Constructor for the Residential class
   * @param address - address
   * @param size - size
   * @param numOfBedrooms - number of Bedrooms
   * @param numOfBathrooms - number of Bathrooms
   * @throws NegativeNumberException - if size is less than or equal to zero.
   * @throws IllegalArgumentException - if value is less than or equal to zero or isn't a half or whole number
   */
  public Residential(String address, Integer size, Integer numOfBedrooms,
      Double numOfBathrooms) throws NegativeNumberException, IllegalArgumentException{
    super(address, size);
    validateSize(numOfBedrooms);
    this.numOfBedrooms = numOfBedrooms;
    validateBathroom(numOfBathrooms);
    this.numOfBathrooms = numOfBathrooms;
  }

  /**
   * Validates the number of Bathrooms
   * @param numOfBathrooms - number of Bathrooms
   * @throws IllegalArgumentException - if value is <= to zero or isn't a half or whole number
   */
  private void validateBathroom(Double numOfBathrooms) throws IllegalArgumentException {
    if (numOfBathrooms <= 0.0 || numOfBathrooms % .5 != 0) {
      throw new IllegalArgumentException("Number of Bathrooms should be full or half");
    }
  }

  /**
   * Gets the number of bedrooms
   * @return number of bedrooms
   */
  public Integer getNumOfBedrooms() {
    return this.numOfBedrooms;
  }

  /**
   * Gets the number of Bathrooms
   * @return number of Bathrooms
   */
  public Double getNumOfBathrooms() {
    return this.numOfBathrooms;
  }

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
    Residential that = (Residential) o;
    return Objects.equals(this.numOfBedrooms, that.numOfBedrooms) && Objects
        .equals(this.numOfBathrooms, that.numOfBathrooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), this.numOfBedrooms, this.numOfBathrooms);
  }

  @Override
  public String toString() {
    return "Residential{" +
        "numOfBedrooms=" + this.numOfBedrooms +
        ", numOfBathrooms=" + this.numOfBathrooms +
        "} " + super.toString();
  }
}
