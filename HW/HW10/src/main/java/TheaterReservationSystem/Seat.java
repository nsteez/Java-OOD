package TheaterReservationSystem;

public class Seat {
  private String name; // String value representing a Cap letter from A-Z
  private String reservedFor; //name of the person it has been reserved, or null if not reserved

  public Seat(String name, String reservedFor) {
    this.name = name;
    this.reservedFor = reservedFor;
  }

  public String getName() {
    return name;
  }

  public String getReservedFor() {
    return reservedFor;
  }

  public void setReservedFor(String reservedFor) {
    this.reservedFor = reservedFor;
  }

  @Override
  public String toString() {
    return "Seat{" +
        "name='" + name + '\'' +
        ", reservedFor='" + reservedFor + '\'' +
        '}';
  }
}
