package TheaterReservationSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RowTest {
 private Row row1,row2, row3, row4, row5, row6;
  @Before
  public void setUp() throws Exception {

    row1 = new Row(5,true);
    row2 = new Row(5,true);
    row3 = new Row(5,true);
    row4 = new Row(5,false);
    row5 = new Row(5,false);
    row6 = new Row(5,false);
  }

  @Test
  public void getRowNumber() {
  }

  @Test
  public void getWCAccessible() {
  }

  @Test
  public void testToString() {
    System.out.println(row1);
    System.out.println(row2);
    System.out.println(row3);
  }
}