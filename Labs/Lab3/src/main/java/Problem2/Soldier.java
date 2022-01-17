package Problem2;

public abstract class Soldier extends Pieces implements ISoldier{

  public Soldier(Name name, Integer age) throws IncorrectAgeRangeException {
    super(name, age);
  }
}
