package Problem1;

import java.util.Objects;

/**
 * Represents an Exterior Window Service.
 */
public class Window extends AbstractExterior{
  private int numFloors;
  private double moreThanOneFloor = 1.05;

  /**
   *Constructor for the Window class
   * @param serviceLocation -tell whether a property size is small medium or large.
   * @param isMonthly - boolean of true for if a monthly subscription exist false otherwise.
   * @throws MaxFloorException - if floors surpass max_floors
   */
  public Window(Property serviceLocation, boolean isMonthly)throws MaxFloorException{
    super(serviceLocation, isMonthly);
    this.numFloors = serviceLocation.getNumOfFloors();
    this.validateMaxFloors();
  }

  /**
   * Throws a MaxFloorException
   * @throws MaxFloorException - if the maxFloors has been reached
   */
  public final void validateMaxFloors() throws MaxFloorException{
    int maxFloors = 3;
    if(this.numFloors > maxFloors){
      throw new MaxFloorException();
    }
  }

  /**
   *Calculates the total price of the Service
   * @return price
   */
  @Override
  public double calculatePrice() {
    int numHours = getServicesHour();
    if (numFloors > 1){
      return (getBaseRate() * numHours * moreThanOneFloor) * getDiscountRate();
    }
    else{
      return getBaseRate() * numHours * getDiscountRate();

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
    Window window = (Window) o;
    return numFloors == window.numFloors
        && Double.compare(window.moreThanOneFloor, moreThanOneFloor) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), numFloors, moreThanOneFloor);
  }

  @Override
  public String toString() {
    return "Window{" +
        "numFloors=" + numFloors +
        ", moreThanOneFloor='}" + moreThanOneFloor + " " + super.toString();
  }

}
