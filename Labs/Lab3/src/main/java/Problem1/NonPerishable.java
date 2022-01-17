package Problem1;

public abstract class NonPerishable extends FoodItems {
  //protected final Integer MAX_QUANTITY = 250;

  public NonPerishable(String name, Double pricePerUnit, Integer availableQuantity){
    super(name, pricePerUnit, availableQuantity, 250);
  }

}