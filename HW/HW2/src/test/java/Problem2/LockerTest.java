package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LockerTest {

  private Recipient recipientPratt;
  private Recipient recipientWalsh;
  private Mail recipientPrattMail;
  private Mail recipientWalshMail;

  @Before
  public void setUp() throws Exception {
    recipientPratt = new Recipient("Michaela", "Pratt", "prattM@email.com");
    recipientWalsh = new Recipient("Conner", "Walsh", "walshC@email.com");
    recipientWalshMail = new Mail(2, 8, 10, recipientWalsh);
  }

   @Test
  public void addMail() throws LockerIsFullException, MailTooBigException{
    Locker openLocker = new Locker(5,10,10, null);
    openLocker.addMail(recipientWalshMail);
    //assertEquals(null, "");

  }
  @Test(expected = LockerIsFullException.class)
  public void lockerFull() throws LockerIsFullException, MailTooBigException {
    Locker fullLocker = new Locker(5, 10, 10,
        new Mail(5, 10, 10,
            new Recipient("Conner", "Walsh", "walshC@email.com")));
    recipientWalshMail = new Mail(4, 8, 10, recipientWalsh);
    fullLocker.addMail(recipientWalshMail);

  }

  @Test(expected = MailTooBigException.class)
 public void mailBig() throws LockerIsFullException, MailTooBigException {
    Locker smallLocker = new Locker(5, 10, 10,null);
    recipientWalshMail = new Mail(12, 10, 12, recipientWalsh);
    smallLocker.addMail(recipientWalshMail);
 }

 @Test(expected = MailTooBigException.class)
  public void mailBig2() throws MailTooBigException {
    Locker smallLocker2 = new Locker(5, 10, 15,
                          new Mail(5, 12, 10, recipientWalsh));

  }

  @Test
 public void pickupMail() throws MailTooBigException {
    recipientPratt = new Recipient("Michaela", "Pratt", "prattM@email.com");
    recipientPrattMail = new Mail(4, 8, 10, recipientPratt);
    Locker pickupMatch = new Locker(5, 10, 10, recipientPrattMail);
    pickupMatch.pickupMail(recipientPratt);

  }
}