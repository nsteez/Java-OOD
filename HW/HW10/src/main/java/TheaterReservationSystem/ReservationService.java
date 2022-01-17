package TheaterReservationSystem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class will implement the actual service as a public
 * method that takes a theater as its argument.
 */
public class ReservationService  {

  public void makeReservation(Theater theater, Integer numOfSeats) {
    ArrayList<Row> theaterRows = theater.getRows();

    int numOfRows = theaterRows.size();
    int bestRow = (int) Math.ceil(numOfRows / 2.0);

    if (numOfRows % 2 == 0) {
      for (int i = 1; i <= bestRow; i++) {
        //System.out.println(bestRow + i - 1);
        //theaterRows.add(i, theaterRows.get());
        theaterRows.get(bestRow + i - 1);
        System.out.println(bestRow - i);
      }
    } else {

      System.out.println(bestRow);
      for (int i = 1; i <= bestRow; i++) {
        System.out.println(bestRow + i);
        System.out.println(bestRow - i);
      }
    }
  }
}