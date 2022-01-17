package Problem1;

public class FleetManager {

    TripReport drive(Float distance, AbstractVehicle vehicle)
        throws ExceedsMaxDistanceException{
      Integer duration = Math.round(distance / vehicle.getAverageSpeed());
      return new TripReport(vehicle, vehicle.getAverageSpeed(), distance, duration);
    }

  TripReport drive(Float distance, AbstractVehicle vehicle, Float speed)
      throws ExceedsMaxDistanceException{ // method overloading
    Integer duration = Math.round(distance / speed);
      return new TripReport(vehicle, speed,distance, duration);
  }

  TripReport drive(Float distance, AbstractVehicle vehicle, Float speed, Integer duration)
      throws ExceedsMaxDistanceException{ // method overloading
      return new TripReport(vehicle, speed,distance, duration);

  }

  public static void main(String[] args) throws ExceedsMaxDistanceException {

      FleetManager fManager = new FleetManager();
      AbstractVehicle vehicle1 = new Bus("57", 25.0f,68f);
      Train vehicle2 = new Train("112",45f,120f);
      AbstractVehicle vehicle3 = new Boat("Titanic", 15f, 75f);
      //Bus , Train and Boat all inherit from the Abstractvehicle, all subtypes
      //Different Static data types doesnt matter using subtype polymorphism
      System.out.println(fManager.drive(100f, vehicle1));
    //  System.out.println(fManager.drive(100f, vehicle2));
     // System.out.println(fManager.drive(100f, vehicle3));

      ((Bus)vehicle1).doSomething();

      if (vehicle1 instanceof Bus){
        ((Bus)vehicle1).doSomething();
        System.out.println("yes");

      }

    }


  }
