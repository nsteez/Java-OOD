package finalExam.p1;

public class SmallBusiness extends TaxFiler{
  private Integer numOfEmployees;
  private Double employeeBenefitsExpenses;
  private Double businessExpenses;

  public SmallBusiness(String taxId, ContactInfo contactInfo) {
    super(taxId, contactInfo);

    this.numOfEmployees = numOfEmployees;
    this.employeeBenefitsExpenses = employeeBenefitsExpenses;
    this.businessExpenses = businessExpenses;
  }

  /**
   * Calculates the tax for a tax filer.
   *
   * @return calculated tax for the tax filer as a Double.
   */
  @Override
  public Double calculateTax() {
    return null;
  }
}
