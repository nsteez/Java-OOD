package Problem1;


import java.util.Objects;
public class Course {
  private final String name;
  private final String prefix;
  private final int number;

  public Course(String name, String prefix, int number){
    this.name = name;
    this.prefix = prefix;
    this.number = number;
  }
  @Override
  public String toString(){
    return prefix + number + ": " + name;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return number == course.number &&
        name.equals(course.name) &&
        prefix.equals(course.prefix);
  }
  @Override
  public int hashCode(){
    return Objects.hash(name, prefix, number);

  }
}
