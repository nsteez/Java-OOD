package problem1;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Objects;

/**
 * Represents a repeated monthly donation.
 */
public class Monthly extends AbstractDonation {
  private LocalDateTime cancellationDate;
  private boolean isCancelled;

  public Monthly(LocalDateTime aDateTime, Integer amount)  {
    super(aDateTime, amount);
    this.cancellationDate = null;
    this.isCancelled = false;

  }
  /**
   * Checks if a monthly donation is cancelled.
   */
  public boolean isCancelled(){
    return this.isCancelled;
  }

  /**
   * Sets the cancellation date.
   * @param date - date to cancel
   * @throws IllegalArgumentException - if the date is prior to creation
   */
  public void setCancellation(LocalDateTime date) throws IllegalArgumentException {
    validateCancellation(date);
    this.cancellationDate = date;
    this.isCancelled = true;
  }

  /**
   * Validates if the cancellation date is prior to creation date.
   * @param dateToCancel - dat to cancel
   * @throws IllegalArgumentException - if the date is prior to creation date.
   */
  public void validateCancellation(LocalDateTime dateToCancel) throws IllegalArgumentException{
    if (this.getLocalDateTime().isAfter(dateToCancel))
      throw new IllegalArgumentException("Cancellation date cannot be prior to creation date");
  }

  /**
   * Check the duration of start time v cancellation time.
   * @param year - year to Search
   * @return - returns months or returns zero
   */
  public Integer checkDuration(Integer year){
    LocalDate startTime = getLocalDateTime().toLocalDate();
    if (startTime.getYear() > year){
      return 0;
    }

    LocalDate stopTime;
    if (cancellationDate != null)
    {
      stopTime = cancellationDate.toLocalDate();
      Period period = Period.between(startTime,stopTime);
      return period.getMonths();
    } else {
      return 0;
    }
  }

  /**
   * Gets the amount based on the input year
   * @param year - year to check
   * @return - total
   */
  @Override
  public Integer getAmount(Integer year) {
    return (checkDuration(year) * super.getAmount(year));
  }


  @Override
  public LocalDateTime getLocalDateTime() {
    return super.getLocalDateTime();
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
    Monthly monthly = (Monthly) o;
    return isCancelled == monthly.isCancelled && Objects
        .equals(cancellationDate, monthly.cancellationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), cancellationDate, isCancelled);
  }

  @Override
  public String toString() {
    return "Monthly{" +
        "cancellationDate=" + cancellationDate +
        ", isCancelled=" + isCancelled +
        '}';
  }
}
