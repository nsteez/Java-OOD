package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlumbingTest {
  private Property small,medium, large;
  private Plumbing customer0,customer1,customer2, customer3;

  @Before
  public void setUp() throws Exception {
    small = new Property("1st street",PropertySize.SMALL,10,3,1);
    medium = new Property("3rd Street",PropertySize.MEDIUM,1,1,0);
    customer0= new Plumbing(0,true, medium,false);
    customer1 = new Plumbing(2,true,small,false);
    customer2 = new Plumbing(2,true,small,false);
    customer3 = new Plumbing(3,true,small,true);
  }

  @Test
  public void calculatePrice() {
    assertEquals(420,customer1.calculatePrice(), 0);
    assertEquals(420, customer0.calculatePrice(), 0);
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
        "Plumbing{AbstractSpecialist{numOfLicEmployees=2, isComplex=true}",
        customer1.toString());
  }
}