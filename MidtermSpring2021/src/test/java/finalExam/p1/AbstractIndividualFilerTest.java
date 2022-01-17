package finalExam.p1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AbstractIndividualFilerTest {
  private Employee taxPayer1;
  private SelfEmployed taxPayer2;
  private ContactInfo contactInfo1;
  private Name name1;
  private Name name2;

  @Before
  public void setUp() throws Exception {
    name1 = new Name("Anna","Joy","Welsh");
    name2 = new Name("Bobby","Joy","Vet");
    contactInfo1 = new ContactInfo(name1,
        "Thomas Street",
        "2342342342",
        "anna@email.com",
        60000.0,
        10000.0,
        2555.0,
    80000.0,
        1000.0,
        2000.0,
        0.0);
    taxPayer1 =  new Employee("12345",contactInfo1);
  }

  @Test
  public void calculateTax() {
  }

  @Test
  public void getLoanDeductions() {
  }

  @Test
  public void getHAndRDeduction() {
  }

  @Test
  public void testEquals() {
  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testToString() {
  }
}