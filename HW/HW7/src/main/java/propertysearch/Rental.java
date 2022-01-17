package propertysearch;

public class Rental extends AbstractContract {
  private Integer term; //Term in Months (must be greater than zero)


  public Rental(Double askingPrice, Boolean isNegotiable, Integer term) throws NegativeNumberException{
    super(askingPrice, isNegotiable);
    this.validateMin();
  }

  public final void validateMin()throws NegativeNumberException{
    if(this.term <= 0) {
      throw new NegativeNumberException();
    }

  }
}
