package finalExam.p1;

public class Employee extends AbstractIndividualFiler{

  public Employee(String taxId, ContactInfo contactInfo) {
    super(taxId, contactInfo);
  }

  /**
   * Calculates the tax for a tax filer.
   *
   * @return calculated tax for the tax filer as a Double.
   */
  @Override
  public Double calculateTax() {
    return super.calculateTax();
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
