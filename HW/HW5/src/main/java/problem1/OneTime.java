package problem1;

import java.time.LocalDateTime;


/**
 * Represents a One Time donation
 */
public class OneTime extends AbstractDonation {


  public OneTime(LocalDateTime aDateTime,Integer amount) {
    super(aDateTime,amount);
  }

  /**
   *Gets the amount for a year
   * @param year - year to search
   * @return amount
   */
  @Override
  public Integer getAmount(Integer year) {
    LocalDateTime thisDonationDate = super.getLocalDateTime();

    if (thisDonationDate.getYear() == year)
      return super.getAmount(year);
    else
      return 0;
  }

}
