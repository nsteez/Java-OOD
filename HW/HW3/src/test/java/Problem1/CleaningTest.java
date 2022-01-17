package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CleaningTest {

  private Property small, medium;
  private Cleaning customer1, customer2, customer3, customer4;

  @Before
  public void setUp() throws Exception {
    small = new Property("1st street", PropertySize.SMALL, 10, 3, 1);
    medium = new Property("1st street", PropertySize.MEDIUM, 3, 2, 4);

    customer1 = new Cleaning(small, false);
    customer2 = new Cleaning(small, false);
    customer3 = new Cleaning(small, true);
    customer4 = new Cleaning(medium,false);

  }

  @Test
  public void calculatePrice() {
    assertEquals(42, customer1.calculatePrice(), 0);
    assertEquals(171,customer4.calculatePrice(), 0.3);
  }

  @Test
  public void testEquals() {
    assertTrue(customer1.equals(customer1));
    assertFalse(customer1.equals(null));
    assertTrue(customer1.equals(customer2));
    assertFalse(customer1.equals(customer3));

  }
  @Test
  public void testHashCode(){
    assertTrue(customer1.hashCode() == customer1.hashCode());
  }
  @Test
  public void testToString() {
    assertEquals(
        "Cleaning{AbstractInterior{numPets=1, oneOrTwoPetFee=1.05, threeOrMorePetFee=1.07}",
        customer1.toString());
  }
}