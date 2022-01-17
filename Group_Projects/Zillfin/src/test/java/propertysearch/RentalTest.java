package propertysearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentalTest {
  private Rental test;

  @Before
  public void setUp() throws Exception {
    test = new Rental(1000.0, true, 12);
  }

  @Test (expected = InvalidTermException.class)
  public void invalidTermTest() {
    new Rental(1000.0, true, 0);
  }

  @Test (expected = NegativeNumberException.class)
  public void invalidPriceTest() {
    new Rental(-1.0, true, 12);
  }

  @Test
  public void getAskingPrice() {
    assertEquals(1000.0, test.getAskingPrice(), 0.0);
  }

  @Test
  public void getNegotiable() {
    assertTrue(test.getNegotiable());
  }

  @Test
  public void getTerm() {
    assertEquals(12, test.getTerm(), 0);
  }

  @Test
  public void getValue() {
    assertEquals(12000.0, test.getValue(), 0.0);
  }

  @Test
  public void testEqualsReflexivity() {
    assertTrue(test.equals(test));
  }

  @Test
  public void testEqualsSymmetry() {
    Rental test2 = new Rental(1000.0, true, 12);
    assertTrue(test.equals(test2) && test2.equals(test));
  }

  @Test
  public void testEqualsTransitivity() {
    Rental test2 = new Rental(1000.0, true, 12);
    Rental test3 = new Rental(1000.0, true, 12);
    assertTrue(test.equals(test2)
        && test2.equals(test3)
        && test.equals(test3));
  }

  @Test
  public void testEqualsNullReference() {
    assertFalse(test.equals(null));
  }

  @Test
  public void testEqualsDiffClass() {
    assertFalse(test.equals(new Object()));
  }

  @Test
  public void testNotEquals() {
    assertFalse(test.equals(new Rental(999.0, true, 12)));
    assertFalse(test.equals(new Rental(1000.0, false, 12)));
    assertFalse(test.equals(new Rental(1000.0, true, 13)));
  }

  @Test
  public void testHashCode() {
    assertNotEquals(0, test.hashCode());
  }

  @Test
  public void testHashCodeConsistency() {
    int testHashcode = test.hashCode();
    assertEquals(testHashcode, test.hashCode());
  }

  @Test
  public void testHashCodeConsistencyWithEquals() {
    Rental test2 = new Rental(1000.0, true, 12);
    assertEquals(test.equals(test2), (test.hashCode() == test2.hashCode()));
  }

  @Test
  public void testToString() {
    String expected = "Rental{term=12} AbstractContract{askingPrice=1000.0, negotiable=true}";
    assertEquals(expected, test.toString());
  }
}