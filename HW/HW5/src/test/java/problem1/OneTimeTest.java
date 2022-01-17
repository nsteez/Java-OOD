package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class OneTimeTest {
  private Nonprofit test;
  private AbstractDonation organizationOne;
  private OneTime hundred;
  private OneTime fifty;



  @Before
  public void setUp() throws Exception {
    test = new Nonprofit("organizationOne");
    hundred = new OneTime(LocalDateTime.of(2015,
        Month.JULY, 29, 19, 30, 40),100);
    fifty = new OneTime(LocalDateTime.of(2019,
        Month.JULY, 29, 19, 30, 40),50);
  }

  @Test
  public void getAmount() {
    test.addDonation(hundred);
    test.addDonation(fifty);
    assertEquals((Integer) 100,test.getTotalDonationsForYear(2015));
  }

  @Test
  public void testEquals() {
    assertTrue(hundred.equals(hundred));
    assertFalse(hundred.equals(fifty));
    assertFalse(hundred.equals(null));


  }

  @Test
  public void getLocalDateTime() {
  }
}