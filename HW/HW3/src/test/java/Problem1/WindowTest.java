package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WindowTest {
  private Property small, medium, large;
  private Window guestJohn, guestBob;

  @Before
  public void setUp() throws Exception {
    small = new Property("1st street",PropertySize.SMALL,2,1,1);
    medium = new Property("2nd Street", PropertySize.MEDIUM,10,2,2);
    large = new Property("3rd Street", PropertySize.LARGE,15,3,4);
    guestJohn = new Window(small,false);
    guestBob = new Window(large, true);

  }

  @Test
  public void validateMaxFloors() throws MaxFloorException{
    assertEquals(1,small.getNumOfFloors());
  }

  @Test(expected = MaxFloorException.class)
  public void validateMaxFloor() throws MaxFloorException{
    Property big = new Property("3rd Street", PropertySize.LARGE,10,5,4);
    Window invalidLarge = new Window(big,false);
  }

  @Test
  public void calculatePrice() {
    assertEquals(1,small.getNumOfFloors());
    assertEquals(3,large.getNumOfFloors());
    assertEquals(302,guestBob.calculatePrice(),0.5);
    assertEquals(80, guestJohn.calculatePrice(),0);
  }

  @Test
  public void testEquals() throws MaxFloorException {
    assertTrue(guestJohn.equals(guestJohn));
    assertFalse(guestJohn.equals(null));
    Window guest3 = new Window(small,false);
    assertTrue(guestJohn.equals(guest3));
    assertFalse(guestJohn.equals(guestBob));

  }

  @Test
  public void testHashCode() {
    assertTrue(guestJohn.hashCode() == guestJohn.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Window{numFloors=3, moreThanOneFloor='}1.05 AbstractNonSpecialist{hours=4}",guestBob.toString());
  }
}