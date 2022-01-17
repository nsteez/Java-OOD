package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaintingTest {
  private Property small;
  private Property medium;
  private Property large;
  private Painting customer1, customer2, customer3,customer4;


  @Before
  public void setUp() throws Exception {
    small = new Property("1st street",PropertySize.SMALL,10,3,1);
    medium = new Property("2nd Street", PropertySize.MEDIUM,9,1,4);
    large = new Property("3rd Street", PropertySize.LARGE,10,1,4);
    customer1 = new Painting(small,false);
    customer2 = new Painting(large, true);
    customer3 = new Painting(medium,false);
    customer4 = new Painting(small,false);

  }

  @Test
  public void calculatePrice() {
    assertEquals(640, customer1.calculatePrice(), 0);
    assertEquals(960, customer2.calculatePrice(),0);
    assertEquals(1280, customer3.calculatePrice(),0);
  }

  @Test
  public void testEquals() {
    assertTrue(customer1.equals(customer1));
    assertFalse(customer1.equals(null));
    assertTrue(customer1.equals(customer4));
    assertFalse(customer1.equals(customer3));

  }
  @Test
  public void testToString() {
    assertEquals(
        "Painting{ AbstractInterior{numPets=1, oneOrTwoPetFee=1.05, threeOrMorePetFee=1.07}",
        customer1.toString());
  }
}