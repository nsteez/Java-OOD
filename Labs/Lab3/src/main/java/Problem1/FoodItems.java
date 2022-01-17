package Problem1;

import java.util.Objects;

public abstract class FoodItems implements IFoodItems{
  protected String name;
  protected Double pricePerUnit;
  protected Integer availableQuantity;
  protected Integer maxQuantity;


  public FoodItems(String name, Double pricePerUnit, Integer availableQuantity, Integer maxQuantity){
    this.name = name;
    this.pricePerUnit = pricePerUnit;
    this.availableQuantity = availableQuantity;
    this.maxQuantity = maxQuantity;
  }

  public String getName() {
    return name;
  }

  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  public Integer getAvailableQuantity() {
    return availableQuantity;
  }

  public Integer getMaxQuantity() {
    return maxQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodItems foodItems = (FoodItems) o;
    return Objects.equals(name, foodItems.name) && Objects
        .equals(pricePerUnit, foodItems.pricePerUnit) && Objects
        .equals(availableQuantity, foodItems.availableQuantity) && Objects
        .equals(maxQuantity, foodItems.maxQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getPricePerUnit(), getAvailableQuantity(), getMaxQuantity());
  }

}
