package Problem1;

public class Bus extends AbstractVehicle{
  public  Bus(String id, Float AverageSpeed, Float maxSpeed){
    super(id, AverageSpeed, maxSpeed);
  }

  public void doSomething(){
    System.out.println("Doing something");
  }
}
