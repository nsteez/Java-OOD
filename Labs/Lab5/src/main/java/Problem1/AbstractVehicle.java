package Problem1;

import java.util.Objects;

public abstract class AbstractVehicle implements IVehicle{
  protected String id;
  protected Float AverageSpeed;
  protected Float maxSpeed;


  public AbstractVehicle(String id, Float speed, Float maxSpeed){
    this.id = id;
    this.AverageSpeed = speed;
    this.maxSpeed = maxSpeed;

  }

  public String getId() {
    return this.id;
  }

  public Float getAverageSpeed() {
    return this.AverageSpeed;
  }

  public Float getMaxSpeed() {
    return this.maxSpeed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractVehicle that = (AbstractVehicle) o;
    return Objects.equals(id, that.id) && Objects.equals(AverageSpeed, that.AverageSpeed)
        && Objects.equals(maxSpeed, that.maxSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, AverageSpeed, maxSpeed);
  }

  @Override
  public String toString() {
    return "AbstractVehicle{" +
        "id='" + id + '\'' +
        ", speed=" + AverageSpeed +
        ", maxSpeed=" + maxSpeed +
        '}';
  }
}
