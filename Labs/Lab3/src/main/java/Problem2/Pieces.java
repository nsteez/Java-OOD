package Problem2;

import java.security.PublicKey;

public abstract class Pieces implements IPieces {
  protected Name name;
  protected Integer age;
  private static final int MIN_AGE = 0;
  private static final int MAX_AGE = 128;

  public Pieces(Name name, Integer age) throws IncorrectAgeRangeException{
    if(age < MIN_AGE || age > MAX_AGE){
      throw new IncorrectAgeRangeException();
    }
    this.name = name;
    this.age = age;
  }

  public Name getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }
}
