package Problem1;

public class FamilyRoom extends Room {
  /**
   * Constructs a FamilyRoom object, based on all the provided input parameters.
   * @param price - the price of FamilyRoom.
   * @param numOfGuest - number of guest currently booked into the FamilyRoom.
   * @throws IllegalArgumentException -if maxOccupancy exceeds the limit.
   */
  public FamilyRoom(Double price, Integer numOfGuest)throws IllegalArgumentException{
    super(4, price, numOfGuest);
  }
}
