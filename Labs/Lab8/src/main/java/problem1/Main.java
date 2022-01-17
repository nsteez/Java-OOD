package problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Traveler> travelers = new ArrayList<>();

    Destination inUS = new Destination("Seattle", "US","SEA",0f);
    Destination outUS = new Destination("London","France","FRA", 111f);


    List<Destination> usOnly = new ArrayList<>();
    usOnly.add(inUS);

    List<Destination> worldwide = new ArrayList<>();
    worldwide.add(inUS);
    worldwide.add(outUS);

    Traveler domestic = new Traveler("A", "Burns",usOnly);
    Traveler international = new Traveler("B","Cones",worldwide);

    travelers.add(domestic);
    travelers.add(international);
    travelers.add(domestic);

    TravelerIterator iterator = new TravelerIterator(travelers);

    while (iterator.hasNext()){
      Traveler t = iterator.next();
      System.out.println(t.toString());

    }


  }

}
