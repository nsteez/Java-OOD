package problem1;
/**
 * An interface specifying required behavior for NonProfit
 */
public interface INonProfit {

  /**
   * Returns the sum of all donations processed in a particular year.
   * @return sum
   */
  Integer getTotalDonationsForYear(Integer year);
}
