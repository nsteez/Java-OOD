package propertysearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Agents are people who are responsible for adding lsitings to the company site.
 */
public class Agent<T extends Listing> {
  private String name;
  private List<T> currentListing;
  private Double rate; // percentage of the contract amount that agent takes as
  // payment if they successfully sell / rent the property in one of their listings
  private Double totalEarnings; // This is the total amount the agent has earned from their sales

  public Agent(String name, List<T> currentListing) {
    this.name = name;
    this.currentListing = new ArrayList<>();
  }

  /**
   * Adds an appropriate listing to the agent's current listing collection.
   */
  public void addListing(Listing listing) {

  }

  /**
   * This method method will be called when an Agent successfully makes a sale / rental of one
   * of their listing. Assuming the listing is art of their collection, this method should remove
   * the Listing from their collection and add their commissions earnings amount.
   */
  public void completeListing(Listing listing){

  }

  /**
   * Drop a listing form the Agent's collection without adjusting their earnings. You may decide
   * how to handle the case where the listing passed their earnings. You may decide how to handle
   * the case where the listing passed to method is not present in the Agent's collection.
   */
  public void dropListing(Listing listing) {

  }

  /**
   * This returns the amount of money the agent would mke if they successfully completed all listings
   * in their collection. to calculate the value of a listing, use the same formulas given for a
   * completed listing.
   * @return
   */
  public double getTotalPortfolioValue() {
    return 0.0;
  }


}
