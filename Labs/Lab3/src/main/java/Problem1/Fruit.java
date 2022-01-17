package Problem1;

public class Fruit extends Perishable{

  public Fruit(String name, Double pricePerUnit, Integer availableQuantity,
      Integer orderDate, Integer expirationDate) {
    super(name, pricePerUnit, availableQuantity, orderDate, expirationDate);
  }
}
