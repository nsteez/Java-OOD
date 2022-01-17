package Problem1;

public class DoubleRoom extends Room {

  /**
   * Constructs a new DoubleRoom object, based on all the provided input parameters.
   * @param price - the price of DoubleRoom.
   * @param numOfGuest - number of guest currently booked into the DoubleRoom.
   * @throws IllegalArgumentException - if maxOccupancy exceeds the limit
   */
    public DoubleRoom(Double price, Integer numOfGuest)throws IllegalArgumentException{
      super(2, price, numOfGuest);

    }

}
