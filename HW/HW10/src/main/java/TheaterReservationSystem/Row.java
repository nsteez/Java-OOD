package TheaterReservationSystem;

import java.util.ArrayList;

/**
 * A row is a list of seats.
 */
public class Row extends ArrayList<Seat>{
  private static int lastRow = 0;
  private Integer rowNumber;
  private Boolean isWCAccessible; //indicates whether or not it is wheelchair accessible


  public Row(Integer numberOfSeats, Boolean isWCAccessible){
    super();

    this.rowNumber = 1 + lastRow;
    lastRow = this.rowNumber;
    this.isWCAccessible = isWCAccessible;

    for (int i = 0; i < numberOfSeats; i++) {
      String name = String.valueOf((char) (i + 'A'));
      Seat seat = new Seat(name, "X");
      this.add(seat);

    }
  }

  public Integer getRowNumber() {
    return rowNumber;
  }

  public Boolean getWCAccessible() {
    return isWCAccessible;
  }

  public Integer numFreeSeats(){

    int num = 0;
    for(int i=0; i < this.size(); i++){
      if(this.get(i).getReservedFor().equals("X")){
        num++;
      }
    }
    return num;
  }

  @Override
  public String toString() {
    return "Row{" +
        "rowNumber=" + rowNumber +
        ", isWCAccessible=" + isWCAccessible +
        ", " + super.toString() + '}';
  }

}
