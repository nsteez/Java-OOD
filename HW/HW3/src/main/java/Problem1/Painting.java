package Problem1;

public class Painting extends AbstractInterior{

  public Painting(Property serviceLocation, boolean isMonthly){
    super(serviceLocation, isMonthly);
    PropertySize size = this.serviceLocation.getSize();
    if (size == PropertySize.SMALL || size == PropertySize.MEDIUM) {
      this.hours = 16;
    } else if (size == PropertySize.LARGE) {
      this.hours = 24;
    }
  }
  /**
   *Calculates the total price of the Service
   * @return price
   */
  @Override
  public double calculatePrice() {

    double price = getBaseRate() * this.hours * getDiscountRate();
    return price;
  }

  @Override
  public String toString() {
    return "Painting{" + " " + super.toString();

  }
}
