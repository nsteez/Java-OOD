package propertysearch;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class AgentTest {
  private Agent<Residential, Sale> test;
  private Listing<Residential, Sale> testListing = new Listing<>(new Residential("abc", 1234, 4,4.5), new Sale(1200000.0, true));

  @Before
  public void setUp() throws Exception {
    test = new Agent<>("John Doe", 0.04);
  }

  @Test (expected = RateRangeException.class)
  public void invalidRateTest1() {
    new Agent<>("John Doe", 1.04);
  }

  @Test (expected = RateRangeException.class)
  public void invalidRateTest2() {
    new Agent<>("John Doe", -0.04);
  }

  @Test
  public void getName() {
    assertEquals("John Doe", test.getName());
  }

  @Test
  public void getListings() {
    ArrayList<Listing> expected = new ArrayList<>();
    assertEquals(expected, test.getListings());
  }

  @Test
  public void getCommissionRate() {
    assertEquals(0.04, test.getCommissionRate(), 0.0);
  }

  @Test
  public void getTotalEarnings() {
    assertEquals(0.0, test.getTotalEarnings(), 0.0);
  }

  @Test
  public void addListing() {
    test.addListing(testListing);
    ArrayList<Listing> expected = new ArrayList<>();
    expected.add(testListing);
    assertEquals(expected, test.getListings());
  }

  @Test
  public void completeListing() {
    test.addListing(testListing);
    test.completeListing(testListing);
    assertEquals(48000.0, test.getTotalEarnings(), 0.0);
    test.completeListing(testListing);
  }

  @Test
  public void dropListing() {
    test.addListing(testListing);
    test.dropListing(testListing);
    assertEquals(new ArrayList<Listing>(), test.getListings());
    assertEquals(0.0, test.getTotalEarnings(), 0.0);
  }

  @Test
  public void getTotalPortfolioValue() {
    test.addListing(testListing);
    test.addListing(testListing);
    assertEquals(96000.0, test.getTotalPortfolioValue(), 0.0);
  }

  @Test
  public void testEqualsReflexivity() {
    assertTrue(test.equals(test));
  }

  @Test
  public void testEqualsSymmetry() {
    Agent<Residential, Sale> test2 = new Agent<>("John Doe", 0.04);
    assertTrue(test.equals(test2) && test2.equals(test));
  }

  @Test
  public void testEqualsTransitivity() {
    Agent<Residential, Sale> test2 = new Agent<>("John Doe", 0.04);
    Agent<Residential, Sale> test3 = new Agent<>("John Doe", 0.04);
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
    assertFalse(test.equals(new Agent<>("Jean Doe", 0.04)));
    assertFalse(test.equals(new Agent<>("John Doe", 0.03)));
    Agent<Residential, Sale> test2 = new Agent<>("John Doe", 0.04);
    test2.addListing(testListing);
    assertFalse(test.equals(test2));
    test2.completeListing(testListing);
    assertFalse(test.equals(test2));
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
    Agent<Residential, Sale> test2 = new Agent<>("John Doe", 0.04);
    assertEquals(test.equals(test2), (test.hashCode() == test2.hashCode()));
  }

  @Test
  public void testToString() {
    String expected = "Agent{name='John Doe', listings=[], commissionRate=0.04, totalEarnings=0.0}";
    assertEquals(expected, test.toString());
  }
}