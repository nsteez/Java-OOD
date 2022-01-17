package problem2;

import java.util.List;


/**
 * Class represents a traveler. The traveler has a first name, last name and a
 * list of destinations they visited in the last three years.
 */
public class Traveler implements Comparable<Traveler> {
  private String firstName;
  private String lastName;
  private List<Destination> traveledDestinations;


  /**
   * Constructs a Traveler object and initializes it
   * to the given first name, last name and the list of traveled destinations
   * @param firstName the first name of this person
   * @param lastName the last name of this person
   * @param traveledDestinations list of destinations they visited in the last three years.
   */

  public Traveler(String firstName, String lastName, List<Destination> traveledDestinations) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.traveledDestinations = traveledDestinations;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public List<Destination> traveledDestinations() {
    return traveledDestinations;
  }

  public Integer countOfQualifyingTrips(){
    String india = "India";
    String germany = "Germany";
    int count = 0;
    for (Destination destination : traveledDestinations) {
      if (destination.getCountry().equals(india) || destination.getCountry().equals(germany)){
        count ++;
      }
    }
    return count;
  }


  @Override
  public int compareTo(Traveler otherTraveler) {
    int one = this.countOfQualifyingTrips();
    int two = otherTraveler.countOfQualifyingTrips();
    if (one < two){
      return -1;
    } else if (one > two) {
      return 1;
    } else{
      return 0;
    }
  }
}
