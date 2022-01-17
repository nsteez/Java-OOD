package finalExam.p1;

public interface Deductions {

  /**
   * Retirement and health savings deduction. For all tax filers,
   * their current taxable income is further reduced by retirement and health savings deduction.
   * @return deduction;
   */
  Double getHAndRDeduction();

  /**
   * Checks if eligible for student loan.
   * @return deduction;
   */
  Double getLoanDeductions();

}
