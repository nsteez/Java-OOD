package problem2;

import java.util.Comparator;
import java.util.List;

public class CanadaTripComparator implements Comparator<Traveler> {

  /**
   * Method comapres two Travelers based off of QualifyingTrips
   * @param t1 - traveler one
   * @param t2 - traveler two
   * @return -1, 1 or 0
   */

  @Override
  public int compare(Traveler t1, Traveler t2) {
    int one = getQualifyingTrips(t1.traveledDestinations());
    int two = getQualifyingTrips(t2.traveledDestinations());
    if (one < two){
      return -1;
    } else if (one > two) {
      return 1;
    } else{
      return 0;
    }
  }

  private int getQualifyingTrips(List<Destination> traveledDestinations) {
    String india = "India";
    String germany = "Germany";
    String canada = "Canada";
    int count = 0;
    for (Destination destination : traveledDestinations) {
      if (destination.getCountry().equals(india) || destination.getCountry().equals(germany) ||
        destination.getCountry().equals(canada)){
        count ++;
      }
    }
    return count;
  }


}
