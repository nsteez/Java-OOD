package TheaterReservationSystem;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import jdk.internal.joptsimple.internal.Rows;
import org.junit.Before;
import org.junit.Test;

public class ReservationServiceTest {
  private Row row1,row2, row3, row4, row5, row6;
  private Theater cinaMax;
  private ArrayList<Row> rows;
  private ArrayList <Integer> accessibleRows;


  @Before
  public void setUp() throws Exception {
    rows = new ArrayList<>();
    accessibleRows = new ArrayList<>();

    row1 = new Row(5,true);
    row2 = new Row(5,true);
    row3 = new Row(5,true);
    row4 = new Row(5,false);
    row5 = new Row(5,false);
    row6 = new Row(5,false);

    rows.add(row1); rows.add(row2); rows.add(row3); rows.add(row4); rows.add(row5); rows.add(row6);
    accessibleRows.add(1); accessibleRows.add(2); accessibleRows.add(3);

    cinaMax = new Theater("CinaMax",rows,accessibleRows);
  }

  @Test
  public void makeReservation() {
    ArrayList<Row> theaterRows = cinaMax.getRows();
    System.out.println(theaterRows);
    System.out.println("-----");
    //System.out.println(makeReservation(cinaMax,);
  }
}