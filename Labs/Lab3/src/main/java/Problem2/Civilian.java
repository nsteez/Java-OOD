package Problem2;

public abstract class Civilian extends Pieces implements ICivilian{

  public Civilian(Name name, Integer age) throws IncorrectAgeRangeException {
    super(name, age);
  }
}
