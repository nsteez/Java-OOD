package problem3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantRecommender {
  private Map<Restaurant,Integer> restaurantData;
  private static final Integer VALUE = 1;

  public Map<Restaurant, Integer> getAggregatedStatistics(List<Guest> guests){
    Map<Restaurant, Integer> result = new HashMap<>();
    if(guests == null || guests.size() == 0){
      return result;
    }
    for (Guest guest: guests){
      for (Restaurant restaurant : guest.getVisitedRestaurant()){
        if(!result.containsKey(restaurant)){
          result.put(restaurant, VALUE);
        } else{
          result.put(restaurant, result.get(restaurant) + VALUE);
        }
      }
    }
    this.restaurantData = result;
    return result;
  }

  public Restaurant recommendedMostVisitedRestaurant(){
    Restaurant mostVisited = null;
    Integer numOfVisits = 0;

    for(Map.Entry<Restaurant, Integer> entry: this.restaurantData.entrySet()){
      if(entry.getValue() > numOfVisits){
        mostVisited = entry.getKey();
        numOfVisits = entry.getValue();
      }
    }
    return mostVisited;

  }

  public Restaurant recommendHighlyRatedRestaurant(String cuisine){
    Restaurant highestRated = null;
    Float rating = 0f;

    for(Map.Entry<Restaurant, Integer> entry: this.restaurantData.entrySet()){
      if(entry.getKey().getCuisine().equals(cuisine) && entry.getKey().getRating() > rating){
        highestRated = entry.getKey();
        rating = entry.getKey().getRating();
      }
    }
    return highestRated;
  }

}
