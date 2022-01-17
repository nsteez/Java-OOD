package problem1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.Month;
import org.junit.Before;
import org.junit.Test;

public class MonthlyTest {
  private Nonprofit test;
  private AbstractDonation organizationOne;
  private Monthly hundred;
  private Monthly fifty;
  private Monthly twenty;
  private LocalDateTime cancelFifty, cancelHundred, cancelTwenty;

  @Before
  public void setUp() throws Exception {
    test = new Nonprofit("organizationOne");
    hundred = new Monthly(LocalDateTime.of(2018,
        Month.MARCH, 1, 6, 30, 10),100);
    twenty = new Monthly(LocalDateTime.of(2020,
        Month.JANUARY, 5, 8, 0, 15),20);
    fifty = new Monthly(LocalDateTime.of(2019,
        Month.JULY, 29, 19, 30, 40),50);
    cancelTwenty = LocalDateTime.of(2020,
        Month.SEPTEMBER, 5, 7, 59, 0);
    cancelHundred = LocalDateTime.of(2018,
        Month.NOVEMBER, 1, 6, 29, 0);
  }

  @Test
  public void isCancelled() {
    assertFalse(fifty.isCancelled());
  }

  @Test
  public void setCancellation() {
    cancelFifty = LocalDateTime.of(2019,
        Month.AUGUST, 29, 19, 30, 40);
    fifty.setCancellation(cancelFifty);
    assertTrue(fifty.isCancelled());
  }

  @Test(expected = IllegalArgumentException.class)
  public void invalidSet(){
    cancelFifty = LocalDateTime.of(2019,
        Month.JUNE, 29, 19, 30, 40);
    fifty.setCancellation(cancelFifty);

  }

  @Test
  public void getAmount() {

    twenty.setCancellation(cancelTwenty);


    assertEquals((Integer) 160,twenty.getAmount(2020));
    hundred.setCancellation(cancelHundred);
    assertEquals((Integer) 800,hundred.getAmount(2018));
  }

  @Test
  public void testDuration(){
    twenty.setCancellation(cancelTwenty);

    assertEquals((Integer) 8,twenty.checkDuration(2020));
  }

  @Test
  public void toGetTotalDonationsYear(){
    test.addDonation(hundred);
    test.addDonation(fifty);
    assertEquals((Integer) 0,test.getTotalDonationsForYear(2019));

  }
  @Test
  public void getLocalDateTime() {
    LocalDateTime copyhundred = hundred.getLocalDateTime();
    assertEquals(copyhundred, hundred.getLocalDateTime());
  }

  @Test
  public void testEquals() {
    assertTrue(hundred.equals(hundred));
    assertFalse(hundred.equals(twenty));
    assertFalse(hundred.equals(null));


  }

  @Test
  public void testHashCode() {
    assertTrue(hundred.hashCode() == hundred.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Monthly{cancellationDate=null, isCancelled=false}", hundred.toString());
  }
}