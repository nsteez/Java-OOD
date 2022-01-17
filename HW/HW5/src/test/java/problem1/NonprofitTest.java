package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

public class NonprofitTest {
  private Nonprofit organization1;
  private OneTime hundred;

  @Before
  public void setUp() throws Exception {
    organization1 = new Nonprofit("ChildrenFoundation");
    hundred = new OneTime(LocalDateTime.of(2015,
        Month.JULY, 29, 19, 30, 40),100);
  }

  @Test
  public void addDonation() {
    organization1.addDonation(hundred);
    //assertEquals("",);
  }

  @Test
  public void getTotalDonationsForYear() {
  }

  @Test
  public void testEquals() {
    assertTrue(organization1.equals(organization1));
    Nonprofit organization2 = new Nonprofit("RossFoundation");
    Nonprofit organization3 = new Nonprofit("ChildrenFoundation");
    organization3.addDonation(hundred);
    assertFalse(organization1.equals(null));
    assertFalse(organization1.equals(organization2));
    assertFalse(organization1.equals(organization3));
  }

  @Test
  public void testHashCode() {
    assertTrue(organization1.hashCode() == organization1.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Nonprofit{organization='ChildrenFoundation', donations=[], pledges=[]}",organization1.toString());
  }
}