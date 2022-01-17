package finalExam.p1;

/**
 * Abstract that represents an individual filer.
 */
public abstract class AbstractIndividualFiler extends TaxFiler implements Deductions{
  private static final Double HEALTH_RETIREMENT_SAVINGS_DEDUCTION = 0.7;
  private static final Double STUDENT_LOAN_DEDUCTION = 1500.0;
  private static final Integer BASE_INCOME = 55000;
  private static final Double BASE_INCOME_LOWER = 0.15;
  private static final Double BASE_INCOME_HIGHER = 0.19;
  private static final Integer STUDENT_LOAN_EXPENSES_AMOUNT_FOR_DEDUCTION= 5000;
  private static final Integer INCOME_FOR_STUDENT_LOAN_DEDUCTION = 75000;




  public AbstractIndividualFiler(String taxId, ContactInfo contactInfo) {
    super(taxId, contactInfo);
  }

  /**
   * Calculates the tax for a tax filer.
   *
   * @return calculated tax for the tax filer as a Double.
   */
  @Override
  public Double calculateTax() {
    Double taxableIncome = super.calculateTax();

    if (taxableIncome < BASE_INCOME) {
      return taxableIncome * BASE_INCOME_LOWER - getHAndRDeduction() - getLoanDeductions();
    }
    else
      return taxableIncome * BASE_INCOME_HIGHER - getHAndRDeduction() - getLoanDeductions();
    }


   public Double getLoanDeductions() {

     //taxableIncome = taxableIncome * HEALTH_RETIREMENT_SAVINGS_DEDUCTION;
     Double studentExpenses = getContactInfo().getStudentLoanTuitionPaid();

     if (getContactInfo().getPriorYearEarnings() < INCOME_FOR_STUDENT_LOAN_DEDUCTION
         && studentExpenses > STUDENT_LOAN_EXPENSES_AMOUNT_FOR_DEDUCTION) {
       return STUDENT_LOAN_DEDUCTION;
     }
     return 0.0;

   }

   public Double getHAndRDeduction() {

    double totalContributions = getContactInfo().getHealthSavingsContributions()
        + getContactInfo().getRetirementSavingsContributions();
    if (totalContributions > 0) {
      return totalContributions * HEALTH_RETIREMENT_SAVINGS_DEDUCTION;

    }else
      return 0.0;

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