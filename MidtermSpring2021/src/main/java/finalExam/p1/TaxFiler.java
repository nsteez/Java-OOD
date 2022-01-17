package finalExam.p1;

import java.util.Objects;

/**
 * Represents a tax filer in the company tax System.
 */
public class TaxFiler implements ITaxSystem{
  private String taxId;
  private ContactInfo contactInfo;
  private static final Double MORTGAGE_INTEREST_PROPERTY_TAX_DEDUCTION = 2500.0;
  private static final Double MORTGAGE_DEDUCTION_CAP = 150000.0;
  private static final Double MORTGAGE_INTEREST_HIGHER = 12500.0; // If tax filers report more than this amount
  private static final Double CHILD_AND_DEPENDANT_INCOME = 75000.0;
  private static final Double DEPENDENT_TAX_CREDIT = 750.0;




  public TaxFiler( String taxId, ContactInfo contactInfo){
    this.taxId = taxId;
    this.contactInfo = contactInfo;

  }

  public String getTaxId() {
    return taxId;
  }

  public ContactInfo getContactInfo() {
    return contactInfo;
  }

  /**
   * Calculates the tax for a tax filer.
   *
   * @return calculated tax for the tax filer as a Double.
   */
  @Override
  public Double calculateTax() {
    return basicTaxableIncome() - getMortgageInterestPropertyTaxDeduction();
  }

  public Double getMortgageInterestPropertyTaxDeduction(){
    if (contactInfo.getPriorYearEarnings() < MORTGAGE_DEDUCTION_CAP
        && getContactInfo().getMortgageInterestPaid() > MORTGAGE_INTEREST_HIGHER ){
      return MORTGAGE_INTEREST_PROPERTY_TAX_DEDUCTION;
    }
    return 0.0;
  }
  public Double getChildAndDependentCredit(){
    if ( contactInfo.getPriorYearEarnings() < CHILD_AND_DEPENDANT_INCOME) {
      return DEPENDENT_TAX_CREDIT;
    }
    return 0.0;
  }

  /**
   * Calculates the basic taxable income for all tax filers Subtracting the amount of income taxes
   * already paid by their last years earnings and then subtracting any charitable donations.
   *
   * @return basic taxable income.
   */
  public Double basicTaxableIncome() {
    return this.contactInfo.getPriorYearEarnings()
        - this.contactInfo.getTotalIncomeTaxPaid()
        - this.contactInfo.getCharitableDonations();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxFiler taxFiler = (TaxFiler) o;
    return Objects.equals(taxId, taxFiler.taxId) && Objects
        .equals(contactInfo, taxFiler.contactInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId, contactInfo);
  }

  @Override
  public String toString() {
    return "TaxFiler{" +
        "taxId='" + taxId + '\'' +
        ", contactInfo=" + contactInfo +
        '}';
  }
}
