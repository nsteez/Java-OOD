package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MailTest {

  private Mail recipientPratt;
  private Mail recipientPratt2;
  //private Recipient recipientPratt;

  @Before
  public void setUp() throws Exception {
    recipientPratt = new Mail(4, 2, 6,
        new Recipient("Michaela", "Pratt", "prattM@email.com"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailValidateHeight() {
    new Mail(2, 0, 0, new Recipient("Annalise",
        "Keating", "ak@email.com"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailValidateWidth() {
    new Mail(0, 2, 1, new Recipient("Annalise",
        "Keating", "ak@email.com"));
  }

  @Test
  public void getWidth() {
    assertEquals(4, recipientPratt.getWidth());
  }

  @Test
  public void getHeight() {
    assertEquals(2, recipientPratt.getHeight());
  }

  @Test
  public void getDepth() {
    assertEquals(6, recipientPratt.getDepth());
  }

  @Test
  public void getRecipient() {
    assertTrue(recipientPratt.getRecipient().equals(new Recipient("Michaela",
        "Pratt", "prattM@email.com")));
  }
}