package Problem1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListOfCoursesTest {
  private Course element0, element1;
  private Course element3, element4;
  private ListOfCourses catalog1, catalog2;

  @Before
  public void setUp() throws Exception {
    element0 = new Course("Java OOD","CS", 5004);
    element1 = new Course("Intro to CS", "CS", 5001);

    element4 = new Course("English","LiT",101);


    catalog1 = new ListOfCourses();
    catalog2 = new ListOfCourses();
  }

  @Test
  public void append() throws InvalidIndexException {
    assertEquals(0,catalog1.count());
    catalog1.append(element0);
    catalog1.append(element1);
    catalog1.append(element3);

    element3 = new Course("Discrete Math", "CS", 5002);

    assertEquals(element0, catalog1.get(0));
    assertEquals(3,catalog1.count());
    //assertEquals(element1, catalog1.get());
  }


  @Test (expected = InvalidIndexException.class)
  public void invalidIndexAppend() throws InvalidIndexException {
    catalog1.get(2);

  }
  @Test (expected = InvalidIndexException.class)
  public void invalidIndexAppend2() throws InvalidIndexException {
    catalog1.get(-1);

  }

  @Test
  public void remove() throws CourseNotFoundException {
    catalog1.append(element0);
    catalog1.append(element1);
    catalog1.append(element4);
    // int element4Index = catalog1.indexOf(element4);
    ICourseCatalog copy = ListOfCourses.createEmpty();
    copy.append(element0);
    copy.append(element1);

    catalog1.remove(element4);

    assertTrue(catalog1.count()==2);
    assertEquals(catalog1, copy);
  }

  @Test(expected = CourseNotFoundException.class)
  public void InvalidRemove() throws CourseNotFoundException, InvalidIndexException {
    catalog1.append(element0);
    catalog1.remove(element1);
  }

  @Test
  public void hasDuplicates() {
    catalog1.append(element0);
    catalog1.append(element0);
    assertTrue("true", catalog1.hasDuplicates(element0));
    assertFalse("false",catalog1.hasDuplicates(element1));
  }

  @Test
  public void contains() {
    catalog1.append(element0);
    assertEquals(false, catalog1.contains(element1));
    assertEquals(true, catalog1.contains(element0));
  }

  @Test
  public void indexOf() {
    catalog1.append(element0);
    System.out.println(element0.toString());
    assertEquals(-1,catalog1.indexOf(element1));
    assertEquals(0,catalog1.indexOf(element0));
  }

  @Test
  public void count() {
    catalog1.append(element0);
    catalog1.append(element1);
    assertEquals(2, catalog1.count());

  }

  @Test
  public void isEmpty() {
    catalog1.append(element0);
    assertFalse("false", catalog1.isEmpty());
    assertTrue("true", catalog2.isEmpty());
  }

  @Test
  public void testEquals() {
    assertTrue(catalog1.equals(catalog1));
    assertFalse(catalog1.equals(null));
    assertFalse(catalog1.equals(" "));
  }

  @Test
  public void testHashCode() {
    assertTrue(catalog1.hashCode() == ListOfCourses.createEmpty().hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("ListOfCourses{courses=[null, null], size=0}", catalog1.toString());

  }
}