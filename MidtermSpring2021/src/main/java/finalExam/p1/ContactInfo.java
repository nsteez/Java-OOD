package finalExam.p1;

import java.util.Objects;

/**
 * Represents contact information for a tax filer.
 */
public class ContactInfo {
  private Name name;
  private String address;
  private String phoneNumber;
  private String email;
  private Double priorYearEarnings;
  private Double totalIncomeTaxPaid;
  private Double mortgageInterestPaid;
  private Double studentLoanTuitionPaid;
  private Double retirementSavingsContributions;
  private Double healthSavingsContributions;
  private Double charitableDonations;


  public ContactInfo(Name name, String address, String phoneNumber, String email,
      Double priorYearEarnings, Double totalIncomeTaxPaid, Double mortgageInterestPaid,
      Double studentLoanTuitionPaid, Double retirementSavingsContributions,
      Double healthSavingsContributions, Double charitableDonations) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.priorYearEarnings = priorYearEarnings;
    this.totalIncomeTaxPaid = totalIncomeTaxPaid;
    this.mortgageInterestPaid = mortgageInterestPaid;
    this.studentLoanTuitionPaid = studentLoanTuitionPaid;
    this.retirementSavingsContributions = retirementSavingsContributions;
    this.healthSavingsContributions = healthSavingsContributions;
    this.charitableDonations = charitableDonations;
  }

  public Name getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public Double getPriorYearEarnings() {
    return priorYearEarnings;
  }

  public Double getTotalIncomeTaxPaid() {
    return totalIncomeTaxPaid;
  }

  public Double getMortgageInterestPaid() {
    return mortgageInterestPaid;
  }

  public Double getStudentLoanTuitionPaid() {
    return studentLoanTuitionPaid;
  }

  public Double getRetirementSavingsContributions() {
    return retirementSavingsContributions;
  }

  public Double getHealthSavingsContributions() {
    return healthSavingsContributions;
  }

  public Double getCharitableDonations() {
    return charitableDonations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInfo that = (ContactInfo) o;
    return Objects.equals(name, that.name) && Objects
        .equals(address, that.address) && Objects.equals(phoneNumber, that.phoneNumber)
        && Objects.equals(email, that.email) && Objects
        .equals(priorYearEarnings, that.priorYearEarnings) && Objects
        .equals(totalIncomeTaxPaid, that.totalIncomeTaxPaid) && Objects
        .equals(mortgageInterestPaid, that.mortgageInterestPaid) && Objects
        .equals(studentLoanTuitionPaid, that.studentLoanTuitionPaid) && Objects
        .equals(retirementSavingsContributions, that.retirementSavingsContributions)
        && Objects.equals(healthSavingsContributions, that.healthSavingsContributions)
        && Objects.equals(charitableDonations, that.charitableDonations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, phoneNumber, email, priorYearEarnings, totalIncomeTaxPaid,
        mortgageInterestPaid, studentLoanTuitionPaid, retirementSavingsContributions,
        healthSavingsContributions, charitableDonations);
  }

  @Override
  public String toString() {
    return "ContactInfo{" +
        "name=" + name +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", priorYearEarnings=" + priorYearEarnings +
        ", totalIncomeTaxPaid=" + totalIncomeTaxPaid +
        ", mortgageInterestPaid=" + mortgageInterestPaid +
        ", studentLoanTuitionPaid=" + studentLoanTuitionPaid +
        ", retirementSavingsContributions=" + retirementSavingsContributions +
        ", healthSavingsContributions=" + healthSavingsContributions +
        ", charitableDonations=" + charitableDonations +
        '}';
  }
}
