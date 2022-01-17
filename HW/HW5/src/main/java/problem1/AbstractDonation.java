package problem1;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *Represents the shared behavior of all donations.
 */
public abstract class AbstractDonation implements IDonation{
  protected LocalDateTime aDateTime;
  protected Integer amount;


  public AbstractDonation(LocalDateTime aDateTime, Integer amount){
    this.aDateTime = aDateTime;
    this.amount = amount;
  }
  public AbstractDonation(Integer amount){
    this.amount = amount;
  }

  /**
   * Donation amount
   * @return the amount
   */
  @Override
  public Integer getAmount(Integer year) {
    return this.amount;
  }

  /**
   * Get LocalDateTime
   * @return DateTime
   */
  @Override
  public LocalDateTime getLocalDateTime(){
   return this.aDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractDonation that = (AbstractDonation) o;
    return Objects.equals(aDateTime, that.aDateTime) && Objects
        .equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aDateTime, amount);
  }

  @Override
  public String toString() {
    return "AbstractDonation{" +
        "aDateTime=" + aDateTime +
        ", amount=" + amount +
        '}';
  }
}
