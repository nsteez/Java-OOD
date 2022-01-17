package problem3;

import java.util.Objects;

/**
 * Class Restaurant contains information about restaurant.
 */
public class Restaurant {

  private String restaurantName;
  private String address;
  private String cuisine;
  private Float rating;

  /**
   * Constructor for object Restaurant.
   * @param restaurantName - restaurant name, as a String
   * @param address - restaurant address, as a String
   * @param cuisine - attribute defining the dominant cuisine offered
   * by the restaurant
   * @param rating - attribute defining the average customer rating of the restaurant over the last year
   */
  public Restaurant(String restaurantName, String address,
      String cuisine, Float rating) {
    this.restaurantName = restaurantName;
    this.address = address;
    this.cuisine = cuisine;
    this.rating = rating;
  }

  /**
   * Getter for parameter restaurantsName.
   * @return restaurantsName - String, representing a restaurant's name */
  public String getRestaurantName() {
    return restaurantName;
  }

  /**
   * Getter for parameter address.
   * @return address - String, representing a restaurant's address */
  public String getAddress() {
    return address;
  }

  /**
   * Getter for parameter cuisine.
   * @return cuisine - String representing the dominant
   * cuisine offered by the restaurant */
  public String getCuisine() {
    return cuisine;
  }

  /*
   * Getter for parameter rating.
   * @return rating - Float the average customer rating of the restaurant over the last year
   */
  public Float getRating() {
    return rating;
  }

}