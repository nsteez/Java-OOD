package Problem1;

public class SingleRoom extends Room {

  /**
   * Constructs a new SingleRoom object, based on all the provided input parameters.
   * @param price - the price of DoubleRoom.
   * @param numOfGuest - number of guest currently booked into the SingleRoom.
   * @throws IllegalArgumentException - if maxOccupancy exceeds the limit
   */
  public SingleRoom(Double price, Integer numOfGuest) throws IllegalArgumentException{
    super(1, price, numOfGuest);

  }
}
