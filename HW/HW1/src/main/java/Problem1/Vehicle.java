package Problem1;

/**
 * Vehicle is a simple object that has a unique Vehicle Identification Number (VIN), and corresponding license plate.
 */
public class Vehicle {
    private Integer vin;
    private String licensePlate;
    private Owner vehicleOwner;

    /**
     * Constructor that creates a new vehicle object with the specified VIN and
     * license plate.
     * @param vin - vin of the new Vehicle object.
     * @param licensePlate - license plate of the new Vehicle.
     * @param vehicleOwner = owner of the vehicle.
     */
    public Vehicle(Integer vin, String licensePlate, Owner vehicleOwner) {
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.vehicleOwner = vehicleOwner;
    }

    /**
     * Returns the VIN of the Vehicle.
     * @return the VIN of the Vehicle.
     */
    public Integer getVin() {
        return this.vin;
    }

    /**
     * Returns the licensePlate of the Vehicle.
     * @return the licensePlate of the Vehicle.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     *Returns Owner of the Vehicle
     * @return Owner of the vehicle.
     */
    public Owner getVehicleOwner(){
        return this.vehicleOwner;
    }

    /**
     * Sets the VIN of the Vehicle.
     */
    public void setVin(Integer vin) {
        this.vin = vin;
    }

    /**
     * Sets the licensePlate of the Vehicle
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
