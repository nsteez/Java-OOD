package Problem1;

public class Room {

  protected Integer maxOccupancy;
  protected Double price;
  protected Integer numOfGuest;

  /**
   * Constructs a new Room object, based on all the provided input parameters.
   *
   * @param maxOccupancy - maximum amount of guest allowed
   * @param price        - price of the Room.
   * @param numOfGuest   - number of guest currently booked into the room.
   * @throws IllegalArgumentException if maxOccupancy exceeds the limit.
   */
  public Room(Integer maxOccupancy, Double price, Integer numOfGuest)
      throws IllegalArgumentException {
    if (numOfGuest > maxOccupancy) {
      throw new IllegalArgumentException("Max Occupancy is " + maxOccupancy);
    }
    this.maxOccupancy = maxOccupancy;
    this.price = price;
    this.numOfGuest = numOfGuest;

  }

  /**
   * Returns the maxOccupancy of the Room.
   *
   * @return maxOccupancy of the Room.
   */
  public Integer getMaxOccupancy() {
    return this.maxOccupancy;
  }

  /**
   * Returns the price of the Room.
   *
   * @return price of the Room.
   */
  public Double getPrice() {
    return this.price;
  }

  /**
   * Returns the numOfGuest of Guest.
   *
   * @return the numOfGuest
   */
  public Integer getNumOfGuest() {
    return this.numOfGuest;
  }

  /**
   * Sets the number of guest in the Room.
   *
   * @param numOfGuest - number of guest currently booked into the room.
   */
  public void setNumOfGuest(Integer numOfGuest) {
    this.numOfGuest = numOfGuest;

  }

  /**
   * Checks if room is available. A Room is available if the number of guest currently in the room
   * is zero.
   * @return true if Room has zero guest currently in Room, else false.
   */
  public boolean isAvailable() {
    return numOfGuest == 0;
  }

  /**
   *Checks if Room booking is available, if it passes three criteria.
   * @param numOfGuest - number of guest wanting to book a Room.
   */
  public void bookRoom(Integer numOfGuest) {
    if (isAvailable() == true && numOfGuest > 0 && numOfGuest <= this.maxOccupancy) {
      setNumOfGuest(numOfGuest);
    }
  }


}

