package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;


public class TravelerTest {
  private Traveler ava, bva, cva, dva;
  private Destination india, germany, canada, miami;
  private List<Destination> destinationList1, destinationList2;


  @Before
  public void setUp() throws Exception {

    india = new Destination("New Delhi","India", "1111",8000f);
    germany = new Destination("Berlin","Germany", "2222",5000f);
    canada = new Destination("Toronto","Canada", "3333",200f);
    miami = new Destination("Miami","United States", "4444",400f);

    destinationList1 = new ArrayList<>();
    destinationList1.add(india);
    destinationList1.add(germany);

    destinationList2 = new ArrayList<>();
    destinationList2.add(canada);
    destinationList2.add(germany);
    destinationList2.add(miami);

    ava = new Traveler("Ava","Name",destinationList1);
    bva = new Traveler("Bva","Name",destinationList1);
    cva = new Traveler("Cva","Name",destinationList2);
    dva = new Traveler("Dva","Name",destinationList2);
  }

  @Test
  public void getFirstName() {
  }

  @Test
  public void getLastName() {
  }

  @Test
  public void traveledDestinations() {
  }

  @Test
  public void countOfQualifyingTrips() {
  }

  @Test
  public void compareTo() {

    assertTrue(ava.compareTo(cva) == 1);
//    System.out.println(ava.compareTo(dva));
    assertTrue(dva.compareTo(bva) == -1);
  }
}