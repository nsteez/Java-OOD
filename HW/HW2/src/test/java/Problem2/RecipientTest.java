package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecipientTest {
  private Recipient recipientPratt;

  @Before
  public void setUp() throws Exception {
    recipientPratt = new Recipient("Michaela","Pratt","prattM@email.com");
  }

  @Test
  public void getFirstName() {
    assertEquals("Michaela", recipientPratt.getFirstName());
  }

  @Test
  public void setFirstName() {
    recipientPratt.setFirstName("Mike");
    assertEquals("Mike",recipientPratt.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Pratt", recipientPratt.getLastName());
  }

  @Test
  public void setLastName() {
    recipientPratt.setLastName("Prat");
    assertEquals("Prat",recipientPratt.getLastName());
  }

  @Test
  public void getEmail() {
    assertEquals("prattM@email.com", recipientPratt.getEmail());
  }

  @Test
  public void setEmail() {
    recipientPratt.setEmail("pratt@email.com");
    assertEquals("pratt@email.com",recipientPratt.getEmail());
  }

  @Test
  public void testEquals() {
    assertTrue(new Recipient("Michaela","Pratt","prattM@email.com").equals(recipientPratt));

  }

  @Test
  public void testHashCode() {
    assertFalse(new Recipient("Mary","Littlelamb",
        "Littlelamb@email.com").hashCode() == recipientPratt.hashCode());
  }
}