package problem1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Represents promises to donate a given amount at some point in the future
 */

  public class Pledges extends AbstractDonation {

  private LocalDateTime pledgeDate;

  public Pledges(Integer amount) {
    super(amount);
    this.amount = amount;

  }

  /**
   * Sets the pledge date
   * @param date - date of pledge
   */
  public void setPledgeDate(LocalDateTime date) {
    this.pledgeDate = date;
  }

  /**
   * Gets the amount
   * @param year - amount for year
   * @return amount for year
   */
  @Override
  public Integer getAmount(Integer year){
    if (this.pledgeDate != null && this.pledgeDate.getYear() == year){
      return this.amount;
    }
    return 0;
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
    Pledges pledges = (Pledges) o;
    return Objects.equals(pledgeDate, pledges.pledgeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), pledgeDate);
  }

  @Override
  public String toString() {
    return "Pledges{" +
        "pledgeDate=" + pledgeDate +
        '}';
  }
}


