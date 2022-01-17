package problem1;


import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {

    private String vehicleID;
    private String make;
    private String model;
    private LocalDate yearManufactured;
    private Float mileage;

    public Vehicle(String vehicleID, String make, String model,
        LocalDate yearManufactured, Float mileage) {
      this.vehicleID = vehicleID;
      this.make = make;
      this.model = model;
      this.yearManufactured = yearManufactured;
      this.mileage = mileage;
    }

    public String getVehicleID() {
      return vehicleID;
    }

    public String getMake() {
      return make;
    }

    public String getModel() {
      return model;
    }

    public LocalDate getYearManufactured() {
      return yearManufactured;
    }

    public Float getMileage() {
      return mileage;

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(vehicleID, vehicle.vehicleID) && Objects
        .equals(make, vehicle.make) && Objects.equals(model, vehicle.model)
        && Objects.equals(yearManufactured, vehicle.yearManufactured) && Objects
        .equals(mileage, vehicle.mileage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleID, make, model, yearManufactured, mileage);
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "vehicleID='" + vehicleID + '\'' +
        ", make='" + make + '\'' +
        ", model='" + model + '\'' +
        ", yearManufactured=" + yearManufactured +
        ", mileage=" + mileage +
        '}';
  }
}

