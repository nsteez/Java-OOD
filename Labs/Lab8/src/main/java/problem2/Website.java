package problem2;

import java.util.Objects;

public class Website implements LoanObserver {
  private String name;

  public Website(String name){
    this.name = name;
  }

  @Override
  public void update(Loan observable) {
    System.out.println("Loan update");

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Website website = (Website) o;
    return Objects.equals(name, website.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "Website{" +
        "name='" + name + '\'' +
        '}';
  }
}
