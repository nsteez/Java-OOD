package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

public class PledgesTest {
  private Nonprofit organization1;
  private Pledges thousand;
  private OneTime hundred;
  private LocalDateTime pledgeDate;

  @Before
  public void setUp() throws Exception {
    organization1 = new Nonprofit("ChildrenFoundation");
    thousand = new Pledges(1000);
    organization1.addDonation(thousand);
    pledgeDate = LocalDateTime.of(2022,
        Month.AUGUST, 29, 19, 30, 40);
  }

  @Test
  public void getPledge(){
    assertEquals((Integer) 0, thousand.getAmount(2022));
    thousand.setPledgeDate(pledgeDate);
    assertEquals((Integer)1000,thousand.getAmount(2022));
  }

  @Test
  public void testEquals() {
    Pledges copyThousand = new Pledges(10);
    assertTrue(thousand.equals(thousand));
    assertFalse(thousand.equals(copyThousand));
    assertFalse(thousand.equals(null));
  }

  @Test
  public void testHashCode() {
    assertTrue(thousand.hashCode() == thousand.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Pledges{pledgeDate=null}", thousand.toString());
  }
}