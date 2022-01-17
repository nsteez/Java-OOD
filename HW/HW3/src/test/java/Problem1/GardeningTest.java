package Problem1;

import static org.junit.Assert.*;

import javax.swing.Popup;
import org.junit.Before;
import org.junit.Test;

public class GardeningTest {
  private Property small;
  private Property medium;
  private Property large;
  private Gardening guest1;
  private Gardening guest2,guest3;

  @Before
  public void setUp() throws Exception {
    small = new Property("1st street",PropertySize.SMALL,10,3,1);
    medium = new Property("2nd Street", PropertySize.MEDIUM,9,1,4);
    large = new Property("3rd Street", PropertySize.LARGE,10,1,4);
    guest1 = new Gardening(small,false);
    guest2 = new Gardening(large, true);

  }

  @Test
  public void calculatePrice() {
    assertEquals(60, guest1.calculatePrice(), 0);
    assertEquals(180, guest2.calculatePrice(),0);
  }

  @Test
  public void testEquals() {
    assertTrue(guest1.equals(guest1));
    assertFalse(guest1.equals(null));
    guest3 = new Gardening(small,false);
    assertTrue(guest1.equals(guest3));
  }

  @Test
  public void testHashCode() {
    assertTrue(guest1.hashCode() == guest2.hashCode());


  }

  @Test
  public void testToString() {
    assertEquals("Gardening WASTE_REMOVAL_FEE=20 AbstractNonSpecialist{hours=1}", guest1.toString());
  }
}