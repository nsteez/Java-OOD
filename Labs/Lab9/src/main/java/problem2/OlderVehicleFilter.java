package problem2;
import static java.awt.Color.blue;
import static java.awt.Color.magenta;
import static java.awt.Color.white;
import static java.awt.Color.yellow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OlderVehicleFilter {

  public static List<Vehicle> filterOlderVehicles(List<Vehicle> vehicle) {
    int manufactured = 1999;
    List<Vehicle> vehicles = vehicle.stream().filter(v -> v.getYear() > manufactured).collect(
        Collectors.toList());
    return vehicles;


  }

  public class OlderVehiclesFilter {

    private List<Vehicle> vehicles = new ArrayList<>();

    public OlderVehiclesFilter(List<Vehicle> vehicles) {
      this.vehicles = vehicles;
    }

    public OlderVehiclesFilter(Vehicle vehicle1, Vehicle
        vehicle2, Vehicle vehicle3) {
      this.vehicles.add(vehicle1);
      this.vehicles.add(vehicle2);
      this.vehicles.add(vehicle2);
    }

    public List<String> filterVWvehilces() {
      //YOUR CODE HERE
      return null;
    }


  }
    public static void main(String[] args){
      Vehicle v1 = new Vehicle("Toyota","Camry",1997,yellow);
      Vehicle v2 = new Vehicle("Toyota","Corolla",2007,magenta);
      Vehicle v3 = new Vehicle("Buick","Envision",2022,blue);
      Vehicle v4 = new Vehicle("Ford","F-150",1996,white);

      List<Vehicle> newList = new ArrayList<>();
      newList.add(v1);
      newList.add(v2);
      newList.add(v3);
      newList.add(v4);

      System.out.println(filterOlderVehicles(newList));




  }

}
