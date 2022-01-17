package Problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Vehicle testVehicle;
    private Owner vehicleOwner1;

    @Before
    public void setUp() throws Exception {
        vehicleOwner1 = new Owner("Conner","Walsh", "8001112222");
        testVehicle = new Vehicle(5400,"7BG45", vehicleOwner1);

    }

    @Test
    public void getVIN() {
        assertEquals((Integer) 5400, testVehicle.getVin());
    }

    @Test
    public void getLicensePlate() {
        assertEquals("7BG45", testVehicle.getLicensePlate());
    }

    @Test
    public void getVehicleOwner() {
        assertEquals(testVehicle.getVehicleOwner(), vehicleOwner1);
    }

    @Test
    public void setVIN() {
        testVehicle.setVin(7899);
        assertEquals((Integer) 7899, testVehicle.getVin());
    }

    @Test
    public void setLicensePlate() {
        testVehicle.setLicensePlate("DG67R");
        assertEquals("DG67R", testVehicle.getLicensePlate());
    }
}