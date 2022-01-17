package problem1;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class VehicleOperator {

  private String name;
  private String drivingLicenseNumber;
  private LocalDate dateOfBirth;
  private List<Vehicle> operatedVehicles;

  public VehicleOperator(String name, String drivingLicenseNumber,
      LocalDate dateOfBirth, List<Vehicle> operatedVehicles) {
    this.name = name;
    this.drivingLicenseNumber = drivingLicenseNumber;
    this.dateOfBirth = dateOfBirth;
    this.operatedVehicles = operatedVehicles;
  }

  public String getName() {
    return name;
  }

  public String getDrivingLicenseNumber() {
    return drivingLicenseNumber;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public List<Vehicle> getOperatedVehicles() {
    return operatedVehicles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleOperator that = (VehicleOperator) o;
    return Objects.equals(name, that.name) && Objects
        .equals(drivingLicenseNumber, that.drivingLicenseNumber) && Objects
        .equals(dateOfBirth, that.dateOfBirth) && Objects
        .equals(operatedVehicles, that.operatedVehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, drivingLicenseNumber, dateOfBirth, operatedVehicles);
  }

  @Override
  public String toString() {
    return "VehicleOperator{" +
        "name='" + name + '\'' +
        ", drivingLicenseNumber='" + drivingLicenseNumber + '\'' +
        ", dateOfBirth=" + dateOfBirth +
        ", operatedVehicles=" + operatedVehicles +
        '}';
  }
}
