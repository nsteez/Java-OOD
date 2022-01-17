package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElectricalTest {
  private Property small, medium, large;
  private Electrical guestLucy, guestDiane;


  @Before
  public void setUp() throws Exception {
    small = new Property("1st street",PropertySize.SMALL,2,1,1);
    medium = new Property("2nd Street", PropertySize.MEDIUM,10,2,2);
    large = new Property("3rd Street", PropertySize.LARGE,15,3,4);
    guestLucy = new Electrical(1,false,small, false);

  }

//  @Test
//  public void validateMaxEmployees() {
//    assertEquals(1, guestLucy;);
//  }

  @Test(expected = MaxEmployeeException.class)
  public void validateMaxEmployee() throws MaxEmployeeException{
    Property maxEmployee = new Property("3rd Street", PropertySize.LARGE,10,2,1);
    //guestDiane = new Electrical(2, true,large,true);
    Electrical invalidEmployee = new Electrical(13, true,large,true);

  }
  @Test
  public void calculatePrice() {
    assertEquals(250,guestLucy.calculatePrice(),0);
  }

  @Test
  public void testEquals() throws MaxEmployeeException {
    assertTrue(guestLucy.equals(guestLucy));
    assertFalse(guestLucy.equals(null));
    Electrical guest3 = new Electrical(1,false,small, false);
    assertTrue(guestLucy.equals(guest3));
  }

  @Test
  public void testHashCode() {
    assertTrue(guestLucy.hashCode() == guestLucy.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Electrical{PERMITTING_FEE=50} AbstractSpecialist{numOfLicEmployees=1, isComplex=false}",guestLucy.toString());

  }
}