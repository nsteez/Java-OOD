package propertysearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommercialTest {
  private Commercial test;

  @Before
  public void setUp() throws Exception {
    test = new Commercial("abc", 1234, 12, false);
  }

  @Test (expected = NegativeNumberException.class)
  public void invalidSizeTest() {
    new Commercial("abc", -1, 12, false);
  }

  @Test
  public void getAddress() {
    assertEquals("abc", test.getAddress());
  }

  @Test
  public void getSize() {
    assertEquals(1234, test.getSize(), 0);
  }

  @Test
  public void getNumOfOffices() {
    assertEquals(12, test.getNumOfOffices(), 0);
  }

  @Test
  public void getSuitableForRetail() {
    assertFalse(test.getSuitableForRetail());
  }

  @Test
  public void testEqualsReflexivity() {
    assertTrue(test.equals(test));
  }

  @Test
  public void testEqualsSymmetry() {
    Commercial test2 = new Commercial("abc", 1234, 12, false);
    assertTrue(test.equals(test2) && test2.equals(test));
  }

  @Test
  public void testEqualsTransitivity() {
    Commercial test2 = new Commercial("abc", 1234, 12, false);
    Commercial test3 = new Commercial("abc", 1234, 12, false);
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
    assertFalse(test.equals(new Commercial("abcd", 1234, 12, false)));
    assertFalse(test.equals(new Commercial("abc", 1235, 12, false)));
    assertFalse(test.equals(new Commercial("abc", 1234, 13, false)));
    assertFalse(test.equals(new Commercial("abc", 1234, 12, true)));
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
    Commercial test2 = new Commercial("abc", 1234, 12, false);
    assertEquals(test.equals(test2), (test.hashCode() == test2.hashCode()));
  }

  @Test
  public void testToString() {
    String expected = "Commercial{numOfOffices=12, isSuitableForRetail=false} "
        + "AbstractProperty{address='abc', size=1234}";
    assertEquals(expected, test.toString());
  }
}