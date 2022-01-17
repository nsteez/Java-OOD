package finalExam.p1;

import java.util.Objects;

public class SelfEmployed extends AbstractIndividualFiler{

  private Double homeOfficeExpenses;
  private Double healthInsuranceExpenses;
  private Double vehicleExpenses;
  private Double businessAndInsuranceExpenses;


  public SelfEmployed(String taxId, ContactInfo contactInfo) {
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
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfEmployed that = (SelfEmployed) o;
    return Objects.equals(homeOfficeExpenses, that.homeOfficeExpenses) && Objects
        .equals(healthInsuranceExpenses, that.healthInsuranceExpenses) && Objects
        .equals(vehicleExpenses, that.vehicleExpenses) && Objects
        .equals(businessAndInsuranceExpenses, that.businessAndInsuranceExpenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeOfficeExpenses, healthInsuranceExpenses, vehicleExpenses,
        businessAndInsuranceExpenses);
  }

  @Override
  public String toString() {
    return "SelfEmployed{" +
        "homeOfficeExpenses=" + homeOfficeExpenses +
        ", healthInsuranceExpenses=" + healthInsuranceExpenses +
        ", vehicleExpenses=" + vehicleExpenses +
        ", businessAndInsuranceExpenses=" + businessAndInsuranceExpenses +
        '}';
  }
}
