package propertysearch;

public abstract class AbstractContract {

  private Double askingPrice;
  private Boolean isNegotiable;

  public AbstractContract(Double askingPrice, Boolean isNegotiable) {
    this.askingPrice = askingPrice; // must be non-negative integer
    this.isNegotiable = isNegotiable;
  }

//  public final void validateMin() throws NegativeNumberException {
//    if (this.askingPrice <= 0.0) {
//      throw new NegativeNumberException();
//    }
//  }
}
