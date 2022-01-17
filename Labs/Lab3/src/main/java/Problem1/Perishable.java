package Problem1;

import java.util.Objects;

public abstract class Perishable extends FoodItems {

  protected Integer orderDate;
  protected Integer expirationDate;
  //protected final Integer MAX_QUANTITY = 100;

  //A better approach to use built in LocalDates
  //protected LocalDate orderDate;
  //protected LocalDate expirationDate;


  public Perishable(String name, Double pricePerUnit, Integer availableQuantity,  Integer orderDate,
      Integer expirationDate) {
    super(name, pricePerUnit, availableQuantity, 100);
    this.orderDate = orderDate;
    this.expirationDate = expirationDate;

  }
  public Integer getOrderDate() {
    return orderDate;
  }

  public Integer getExpirationDate() {
    return expirationDate;
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
    Perishable that = (Perishable) o;
    return Objects.equals(orderDate, that.orderDate) && Objects
        .equals(expirationDate, that.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), orderDate, expirationDate);
  }

  @Override
  public String toString() {
    return "Perishable{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        '}';
  }
}
