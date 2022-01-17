package finalExam.p1;

import java.util.Objects;

/**
 * Abstract that represents a Group filer.
 */
public abstract class AbstractGroupFiler extends TaxFiler implements Deductions {
  protected Integer dependants;
  protected Integer minorChildren;
  protected Double childCareExpenses;
  protected Double dependantCareExpenses;
  private static final Double HEALTH_RETIREMENT_SAVINGS_DEDUCTION = 0.65;
  private static final Double STUDENT_LOAN_DEDUCTION = 2500.0;
  private static final Double CHILD_CARE_DEDUCTION = 1250.0;
  private static final Double CHILD_DEPENDANT_CARE_DEDUCTION = 750.0;

  private static final Double RATE_FOR_CHILDCARE_DEDUCTION = 200000.0;

  private static final Double BASE_INCOME_LOWER = 0.145;
  private static final Double BASE_INCOME_HIGHER = 0.19;
  private static final Integer BASE_INCOME_L = 90000; // represents taxable income
  private static final Integer BASE_INCOME_H = 185000;// represents taxable income
  private static final Integer CONTRIBUTION_CAP = 17500;

  private static final Integer INCOME_FOR_STUDENT_LOAN_DEDUCTION = 200000;
  private static final Integer STUDENT_LOAN_EXPENSES_AMOUNT_FOR_DEDUCTION= 5000;





  public AbstractGroupFiler(String taxId, ContactInfo contactInfo) {
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

    if (taxableIncome < BASE_INCOME_L) {
      return taxableIncome * BASE_INCOME_LOWER - getHAndRDeduction() - getLoanDeductions() - getChildCareDeduction() - getChildAndDependentCredit();
    }
    if (taxableIncome > BASE_INCOME_H) {
      return taxableIncome * BASE_INCOME_HIGHER - getHAndRDeduction() - getLoanDeductions() - getChildCareDeduction() - getChildAndDependentCredit();
    } else
      return taxableIncome - getHAndRDeduction() - getLoanDeductions() - getChildCareDeduction() - getChildAndDependentCredit();
  }

  /**
   * Checks if tax group tax filer is eligible for childcare deduction
   * @return deduction
   */
  public Double getChildCareDeduction() {
    if (getContactInfo().getPriorYearEarnings() < RATE_FOR_CHILDCARE_DEDUCTION && this.childCareExpenses > 5000 ){
      return CHILD_CARE_DEDUCTION;

    }
    return 0.0;

  }
  /**
   * Checks if eligible for student loan.
   *
   * @return deduction;
   */
  @Override
  public Double getLoanDeductions() {
    Double studentExpenses = getContactInfo().getStudentLoanTuitionPaid();
    if (getContactInfo().getPriorYearEarnings() < INCOME_FOR_STUDENT_LOAN_DEDUCTION
        && studentExpenses > STUDENT_LOAN_EXPENSES_AMOUNT_FOR_DEDUCTION) {
      return STUDENT_LOAN_DEDUCTION;
    }
    return 0.0;
  }

  /**
   * Retirement and health savings deduction. For all tax filers, their current taxable income is
   * further reduced by retirement and health savings deduction.
   *
   * @return deduction;
   */
  @Override
  public Double getHAndRDeduction() {
    double totalContributions = getContactInfo().getHealthSavingsContributions()
        + getContactInfo().getRetirementSavingsContributions();
    if (totalContributions > CONTRIBUTION_CAP) {
      totalContributions = CONTRIBUTION_CAP;
      return totalContributions * HEALTH_RETIREMENT_SAVINGS_DEDUCTION;
    }
    if (totalContributions < CONTRIBUTION_CAP && totalContributions > 0) {
      return totalContributions * HEALTH_RETIREMENT_SAVINGS_DEDUCTION;

    }
    else
      return 0.0;
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    AbstractGroupFiler that = (AbstractGroupFiler) o;
    return Objects.equals(dependants, that.dependants) && Objects
        .equals(minorChildren, that.minorChildren) && Objects
        .equals(childCareExpenses, that.childCareExpenses) && Objects
        .equals(dependantCareExpenses, that.dependantCareExpenses);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), dependants, minorChildren, childCareExpenses,
            dependantCareExpenses);
  }

  @Override
  public String toString() {
    return "AbstractGroupFiler{" +
        "dependants=" + dependants +
        ", minorChildren=" + minorChildren +
        ", childCareExpenses=" + childCareExpenses +
        ", dependantCareExpenses=" + dependantCareExpenses +
        '}';
  }
}
