package problem1;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents Nonprofit.
 */
public class Nonprofit implements INonProfit {
  private String organization;
  private  ArrayList <AbstractDonation> donations;
  private  ArrayList <AbstractDonation> pledges;


  public Nonprofit(String organization){
    this.organization = organization;
    this.donations = new ArrayList<>();
    this.pledges = new ArrayList<>();
  }

  /**
   * Adds a donation to the Nonprofit
   * @param donation - amount to add.
   */
  public void addDonation(AbstractDonation donation){
    if (donation instanceof Pledges){
      pledges.add(donation);

    }
    donations.add(donation);
  }

  /**
   * Calculates the total Donations for the Year
   * @param year - year to search
   * @return total sum.
   */
  @Override
  public Integer getTotalDonationsForYear(Integer year) {
    int total = 0;
    for (int i = 0; i < donations.size(); i++){
      total += donations.get(i).getAmount(year);
    }
    return total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nonprofit nonprofit = (Nonprofit) o;
    return Objects.equals(organization, nonprofit.organization) && Objects
        .equals(donations, nonprofit.donations) && Objects
        .equals(pledges, nonprofit.pledges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization, donations, pledges);
  }

  @Override
  public String toString() {
    return "Nonprofit{" +
        "organization='" + organization + '\'' +
        ", donations=" + donations +
        ", pledges=" + pledges +
        '}';
  }
}
