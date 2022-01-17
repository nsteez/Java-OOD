package propertysearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListingTest {
  private Listing<Residential, Sale> test;

  @Before
  public void setUp() throws Exception {
    test = new Listing<>(new Residential("abc", 1234, 4,4.5), new Sale(1200000.0, true));
  }

  @Test
  public void getProperty() {
    assertEquals(new Residential("abc", 1234, 4,4.5), test.getProperty());
  }

  @Test
  public void getContract() {
    assertEquals(new Sale(1200000.0, true), test.getContract());
  }

  @Test
  public void testEqualsReflexivity() {
    assertTrue(test.equals(test));
  }

  @Test
  public void testEqualsSymmetry() {
    Listing test2 = new Listing<>(new Residential("abc", 1234, 4,4.5), new Sale(1200000.0, true));
    assertTrue(test.equals(test2) && test2.equals(test));
  }

  @Test
  public void testEqualsTransitivity() {
    Listing test2 = new Listing<>(new Residential("abc", 1234, 4,4.5), new Sale(1200000.0, true));
    Listing test3 = new Listing<>(new Residential("abc", 1234, 4,4.5), new Sale(1200000.0, true));
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
    assertFalse(test.equals(new Listing<>(new Residential("abcd", 1234, 4,4.5), new Sale(1200000.0, true))));
    assertFalse(test.equals(new Listing<>(new Residential("abc", 1234, 4,4.5), new Sale(1200000.0, false))));
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
    Listing test2 = new Listing<>(new Residential("abc", 1234, 4,4.5), new Sale(1200000.0, true));
    assertEquals(test.equals(test2), (test.hashCode() == test2.hashCode()));
  }

  @Test
  public void testToString() {
    String expected = "Listing{property=Residential{numOfBedrooms=4, numOfBathrooms=4.5} "
        + "AbstractProperty{address='abc', size=1234}, "
        + "contract=Sale{} AbstractContract{askingPrice=1200000.0, negotiable=true}}";
    assertEquals(expected, test.toString());
  }
}