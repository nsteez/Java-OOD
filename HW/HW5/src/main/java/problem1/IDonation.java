package problem1;

import java.time.LocalDateTime;

/**
 * A system that will enable non-profits to track the donations they receive.
 */
public interface IDonation {

  /**
   * Donation amount
   * @return the amount
   */
  Integer getAmount(Integer year);

  /**
   * Date and Time the donation was made.
   * @return the date and time.
   */
  LocalDateTime getLocalDateTime();

}
