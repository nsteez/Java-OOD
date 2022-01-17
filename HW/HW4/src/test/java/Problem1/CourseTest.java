package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
  private Course element0, element1;
  //private ListOfCourses catalog1;

  @Before
  public void setUp() throws Exception {
    element0 = new Course("Java OOD","CS", 5004);
    element1 = new Course("Intro to CS", "CS", 5001);

    //catalog1 = new ListOfCourses();
  }

  @Test
  public void testToString() {
    assertEquals("CS5004: Java OOD",element0.toString());
  }

  @Test
  public void testEquals() {
    assertTrue(element0.equals(element0));
    assertFalse(element0.equals(element1));
    assertFalse(element0.equals(null));
    assertFalse(element0.equals(""));
    Course element2 = new Course("Java OOD","CS", 5004);
    assertTrue(element0.equals(element2));

  }

  @Test
  public void testHashCode() {
    assertTrue(element0.hashCode() == element0.hashCode());
  }
}