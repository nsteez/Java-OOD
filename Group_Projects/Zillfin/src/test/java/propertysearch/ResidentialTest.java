package propertysearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResidentialTest {
  private Residential test;

  @Before
  public void setUp() throws Exception {
    test = new Residential("abc", 1234, 4,4.5);
  }

  @Test (expected = IllegalArgumentException.class)
  public void invalidBathrooms1() {
    new Residential("abc", 1234, 4,4.4);
  }

  @Test (expected = IllegalArgumentException.class)
  public void invalidBathrooms2() {
    new Residential("abc", 1234, 4,-0.5);
  }

  @Test
  public void getNumOfBedrooms() {
    assertEquals(4, test.getNumOfBedrooms(), 0);
  }

  @Test
  public void getNumOfBathrooms() {
    assertEquals(4.5, test.getNumOfBathrooms(), 0.0);
  }

  @Test
  public void testEqualsReflexivity() {
    assertTrue(test.equals(test));
  }

  @Test
  public void testEqualsSymmetry() {
    Residential test2 = new Residential("abc", 1234, 4,4.5);
    assertTrue(test.equals(test2) && test2.equals(test));
  }

  @Test
  public void testEqualsTransitivity() {
    Residential test2 = new Residential("abc", 1234, 4,4.5);
    Residential test3 = new Residential("abc", 1234, 4,4.5);
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
    assertFalse(test.equals(new Residential("abcd", 1234, 4,4.5)));
    assertFalse(test.equals(new Residential("abc", 1234, 5,4.5)));
    assertFalse(test.equals(new Residential("abc", 1234, 4,5.5)));
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
    Residential test2 = new Residential("abc", 1234, 4,4.5);
    assertEquals(test.equals(test2), (test.hashCode() == test2.hashCode()));
  }

  @Test
  public void testToString() {
    String expected = "Residential{numOfBedrooms=4, numOfBathrooms=4.5} "
        + "AbstractProperty{address='abc', size=1234}";
    assertEquals(expected, test.toString());
  }
}