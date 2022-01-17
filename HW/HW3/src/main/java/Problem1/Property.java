package Problem1;

import java.util.Objects;

/**
 * The Property for representing where a service will be carried out.
 */
public class Property {

  private String address;
  private PropertySize size;
  private int numOfFloors;
  private int numOfPets;
  private int totalNonSpecialServices;
  private static final double LOYALTY_DISCOUNT = .50; // a discount given to the every 10th non specialist service performed at the property
  private static final double SUBSCRIPTION_DISCOUNT = 0.10; // a discount for monthly users

  /**
   * Constructor for the Property class.
   * @param address - property address
   * @param totalNonSpecialServices - total number of non specialist services carried out at the address
   * @param size - property size of s/m/l
   * @param numOfFloors - number of floors at the property.
   * @param numOfPets - number of pets the property has.
   */
  public Property(String address, PropertySize size,int totalNonSpecialServices,int numOfFloors, int numOfPets) {
    this.address = address;
    this.size = size;
    this.totalNonSpecialServices = totalNonSpecialServices;
    this.numOfFloors = numOfFloors;
    this.numOfPets = numOfPets;
  }
  /**
   * Gets the PropertySize
   * @return the size of the property.
   */
  public PropertySize getSize() {
    return this.size;
  }

  /**
   * A boolean that determines if the Property gets the tenth service discount.
   * @return true for every tenth service, false otherwise.
   */
  public boolean tenthServiceDiscount() {
    if (this.totalNonSpecialServices % 10 == 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Gets the number of floors
   * @return the number of floors.
   */
  public int getNumOfFloors() {
    return this.numOfFloors;
  }

  /**
   * Gets the number of pets.
   * @return the number of pets.
   */
  public int getNumOfPets() {
    return this.numOfPets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return numOfFloors == property.numOfFloors && numOfPets == property.numOfPets
        && totalNonSpecialServices == property.totalNonSpecialServices && Objects
        .equals(address, property.address) && size == property.size;
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, size, numOfFloors, numOfPets, totalNonSpecialServices);
  }

  @Override
  public String toString() {
    return "Property" +
        "address='" + address + '\'' +
        ", size=" + size +
        ", numOfFloors=" + numOfFloors +
        ", numOfPets=" + numOfPets +
        ", totalNonSpecialServices=" + totalNonSpecialServices ;
  }
}