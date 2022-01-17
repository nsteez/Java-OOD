package Problem1;

public class Veg extends Perishable{

  public Veg(String name, Double pricePerUnit, Integer availableQuantity,
      Integer orderDate, Integer expirationDate) {
    super(name, pricePerUnit, availableQuantity, orderDate, expirationDate);
  }
}
