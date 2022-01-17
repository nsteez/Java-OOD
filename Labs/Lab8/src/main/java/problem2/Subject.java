package problem2;

public interface Subject {

  void registerObserver(LoanObserver observer);

  void removeObserver(LoanObserver observer);

  void notifyObservers();

}
