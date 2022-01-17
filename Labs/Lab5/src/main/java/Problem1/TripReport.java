package Problem1;

import java.util.Objects;

public class TripReport {
  private AbstractVehicle trip; //The vehicle that took the trip
  private Float AverageSpeed; // Speed in miles per minute
  private Float distance; //Distance traveled in miles
  private Integer tripDuration; // Trip duration in minutes

  public TripReport(AbstractVehicle trip, Float speed, Float distance, Integer tripDuration)
      throws ExceedsMaxDistanceException {
    this.trip = trip;
    this.AverageSpeed = AverageSpeed;
    validateDistance(distance);
    this.distance = distance;
    this.tripDuration = tripDuration;
  }

  public AbstractVehicle getTrip() {
    return this.trip;
  }

  public Float getAverageSpeed() {
    return this.AverageSpeed;
  }

  public Float getDistance() {
    return this.distance;
  }

  public Integer getTripDuration() {
    return this.tripDuration;
  }

  public static void validateDistance(Float distance) throws ExceedsMaxDistanceException{
    if (distance > 3000f)
      throw new ExceedsMaxDistanceException("Distance exceeded");


  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripReport that = (TripReport) o;
    return Objects.equals(trip, that.trip) && Objects.equals(AverageSpeed, that.AverageSpeed)
        && Objects.equals(distance, that.distance) && Objects
        .equals(tripDuration, that.tripDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trip, AverageSpeed, distance, tripDuration);
  }

  @Override
  public String toString() {
    return "TripReport{" +
        "trip=" + trip +
        ", speed=" + AverageSpeed +
        ", distance=" + distance +
        ", tripDuration=" + tripDuration +
        '}';
  }
}
