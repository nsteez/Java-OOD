package TheaterReservationSystem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TheaterTest {
  private Row test1,test2, test3, test4, test5;
  private Theater roxy, cinaMax;
  private ArrayList<Row> rows1;
  private ArrayList<Integer> accessibleRows1;

  @Before
  public void setUp() throws Exception {
    test1 = new Row(4,true);
    test2 = new Row(4,true);
    test3 = new Row(4,false);
    test4 = new Row(4,false);

    rows1 = new ArrayList<>();
    rows1.add(test1);
    rows1.add(test2);
    rows1.add(test3);
    rows1.add(test4);

    accessibleRows1 = new ArrayList<>();
    accessibleRows1.add(1);
    accessibleRows1.add(2);


    roxy = new Theater("Roxy", rows1, accessibleRows1);
    cinaMax = new Theater("CinaMax", rows1, accessibleRows1);
  }

  @Test
  public void getName() {
    System.out.println(Math.ceil(3 / 2.0));
  }

  @Test
  public void getRow() {
    new ReservationService().makeReservation(roxy,2);
  }

  @Test
  public void getAccessibleRows() {
    System.out.println(roxy.getAccessibleRows());
  }

  @Test
  public void testToString() {
  }
}