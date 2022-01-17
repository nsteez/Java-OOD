package Problem1;

import static Problem1.PropertySize.MEDIUM;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PropertyTest {
  Property simpson;
  Property famGuy;

  @Before
  public void setUp() throws Exception {
    simpson = new Property("742 Evergreen Terrace",PropertySize.MEDIUM,10,3,1);
    famGuy = new Property("31 Spooner Street", PropertySize.LARGE,10,1,4);
  }

  @Test
  public void getSize() {
    assertEquals(PropertySize.MEDIUM, simpson.getSize());
    assertEquals(PropertySize.LARGE, famGuy.getSize());

  }

  @Test
  public void tenthServiceDiscount() {
//    assertTrue();
//    assertFalse();
  }

  @Test
  public void getNumOfFloors() {
    assertEquals(3,simpson.getNumOfFloors());
    assertEquals(1,famGuy.getNumOfFloors());
  }

  @Test
  public void getNumOfPets() {
    assertEquals(1,simpson.getNumOfPets());
    assertEquals(4,famGuy.getNumOfPets());
  }

  @Test
  public void testEquals() {
    assertTrue(simpson.equals(simpson));
    assertFalse(simpson.equals(null));
    Property copy = new Property("742 Evergreen Terrace",PropertySize.MEDIUM,10,3,1);
    assertTrue(simpson.equals(copy));
    assertFalse(simpson.equals(famGuy));

  }

  @Test
  public void testHashCode() {
    Property copy = new Property("742 Evergreen Terrace",PropertySize.MEDIUM,10,3,1);
    assertTrue(simpson.hashCode() == copy.hashCode());


  }

  @Test
  public void testToString() {
    String expected = "Propertyaddress='742 Evergreen Terrace', size=MEDIUM, numOfFloors=3, numOfPets=1, totalNonSpecialServices=10";
        assertEquals(expected, simpson.toString());
  }
}