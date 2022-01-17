package propertysearch;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a real estate agent with their name, a collection of their listings, their commission
 * rate, and their total earnings. An agent can be specialized for a type of contract or a type of
 * property or both or none
 *
 * @param <T> the type of the agent's property specialization
 * @param <U> the type of the agent's contract specialization
 */
public class Agent <T extends AbstractProperty, U extends AbstractContract> {
  private String name;
  private ArrayList<Listing<T, U>> listings;
  private Double commissionRate;
  private Double totalEarnings;
  private static final Double MAX_RATE = 1.0;
  private static final Double MIN_RATE = 0.0;

  /**
   * Creates a new Agent object given a name and a commission rate
   *
   * @param name the agent's name
   * @param commissionRate the agent's commission rate
   */
  public Agent(String name, Double commissionRate) throws RateRangeException {
    this.name = name;
    validateRate(commissionRate);
    this.commissionRate = commissionRate;
    this.listings = new ArrayList<Listing<T, U>>();
    this.totalEarnings = 0.0;
  }

  /**
   * Validates if the rate provided is within the valid range
   *
   * @param rate the rate to be validated
   * @throws RateRangeException if the rate is less than 0 or greater than 1
   */
  private void validateRate(Double rate) throws RateRangeException {
    if (rate > MAX_RATE || rate < MIN_RATE) {
      throw new RateRangeException("Rate cannot be negative or greater than 1.");
    }
  }

  /**
   * Returns the agent's name
   *
   * @return the agent's name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the collection of the agent's current listings
   *
   * @return the collection of the agent's current listings
   */
  public ArrayList<Listing<T, U>> getListings() {
    return this.listings;
  }

  /**
   * Returns the agent's commission rate
   *
   * @return the agent's commission rate
   */
  public Double getCommissionRate() {
    return this.commissionRate;
  }

  /**
   * Returns the agent's total earnings
   *
   * @return the agent's total earnings
   */
  public Double getTotalEarnings() {
    return this.totalEarnings;
  }

  /**
   * Adds the given listing to the Agent’s current listing collection
   *
   * @param listing the listing to be added
   */
  public void addListing(Listing<T, U> listing) {
    this.listings.add(listing);
  }

  /**
   * Removes the given listing from the agent's collection and adds their commission earnings to
   * their total earnings amount
   *
   * @param listing the listing to be completed
   */
  public void completeListing(Listing<T, U> listing) {
    if (this.listings.remove(listing))
      this.totalEarnings += listing.getContract().getValue() * this.commissionRate;
  }

  /**
   * Drops the given listing from the agent’s collection without adjusting their earnings
   *
   * @param listing the listing to be dropped
   */
  public void dropListing(Listing<T, U> listing) {
    this.listings.remove(listing);
  }

  /**
   * Returns the amount of earnings the agent would make if they successfully completed all listings
   * in their collection
   *
   * @return the agent's total portfolio value
   */
  public Double getTotalPortfolioValue() {
    Double result = 0.0;
    for (Listing<T, U> listing : this.listings)
      result += listing.getContract().getValue() * this.commissionRate;
    return result;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    Agent<?, ?> agent = (Agent<?, ?>) o;
    return Objects.equals(this.name, agent.name) && Objects
        .equals(this.listings, agent.listings) && Objects
        .equals(this.commissionRate, agent.commissionRate) && Objects
        .equals(this.totalEarnings, agent.totalEarnings);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.listings, this.commissionRate, this.totalEarnings);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "Agent{" +
        "name='" + this.name + '\'' +
        ", listings=" + this.listings +
        ", commissionRate=" + this.commissionRate +
        ", totalEarnings=" + this.totalEarnings +
        '}';
  }
}
