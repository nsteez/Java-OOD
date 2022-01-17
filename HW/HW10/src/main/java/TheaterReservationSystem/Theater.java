package TheaterReservationSystem;

import java.util.ArrayList;

public class Theater {
  private String theaterName;
  private ArrayList<Row> rows;
  private ArrayList<Integer> accessibleRows;

  public Theater(String name, ArrayList<Row>rows, ArrayList<Integer> accessibleRows) {
    this.theaterName = name;
    this.rows = rows;
    this.accessibleRows = accessibleRows;

  }
  public Row getSingleRow(Integer num){
    return rows.get(num);
  }


  public String getName() {
    return theaterName;
  }

  public ArrayList<Row> getRows() {
    return rows;
  }

  public ArrayList<Integer> getAccessibleRows() {
    return accessibleRows;
  }

  @Override
  public String toString() {
    return "Theater{" +
        "theaterName='" + theaterName + '\'' +
        ", row=" + rows +
        ", accessibleRows=" + accessibleRows +
        '}';
  }
}
