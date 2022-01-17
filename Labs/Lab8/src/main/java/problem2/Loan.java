package problem2;

import java.util.List;

public class Loan implements Subject{
  private String type;
  private double interest;

  // Need a collection to observe
  private List<LoanObserver> observers;

  public Loan(String type, double interest, List<LoanObserver> observers) {
    this.type = type;
    this.interest = interest;
    this.observers = observers;
  }

  public double getInterest() {
    return interest;
  }

  public void setInterest(double interest) {
    this.interest = interest;
  }

  @Override
  public String toString() {
    return "Loan{" +
        "type='" + type + '\'' +
        ", interest=" + interest +
        '}';
  }

  @Override
  public void registerObserver(LoanObserver observer) {
    this.observers.add(observer);

  }

  @Override
  public void removeObserver(LoanObserver observer) {
    this.observers.remove(observer);

  }

  @Override
  public void notifyObservers() {
    for (LoanObserver observer: this.observers)
      observer.update(this);

  }
}
