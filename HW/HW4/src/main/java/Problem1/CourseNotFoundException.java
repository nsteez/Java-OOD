package Problem1;

public class CourseNotFoundException extends Exception{

    /**
     * Constructs a new exception if the course does not exist.
     */

    public CourseNotFoundException(){
      super("Course does not exist");
    }
  }
