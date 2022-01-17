package automator;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class CommunicationGeneratorTest {
  private CommunicationGenerator test;
  private String testTemplate = "To:[[email]]\n"
      + "Subject: Spring sale!\n"
      + "Dear [[first_name]] [[last_name]],\n"
      + "Everything in our store will be 20% off between now and the end of April! Stock up on "
      + "our logo mugs, T shirts, and water bottles to show your support and help raise "
      + "awareness. Our magnets, plushies, and picture books, also make great gifts for the "
      + "children in your life. \n"
      + "\n"
      + "Remember, all proceeds go to support our work and, if we can reach our goal of $10,000 "
      + "in sales by the end of April, an anonymous donor has pledged to match every $1 you "
      + "spend. Want to help out but don’t want to buy stuff? Visit our website to make a "
      + "donation.\n"
      + "\n"
      + "Sincerely, \n"
      + "\n"
      + "Non-Profit Director";
  private String testDir = "OUTPUTS";
  private Supporter testSupporter;

  @Before
  public void setUp() throws Exception {
    test = new CommunicationGenerator(testTemplate, testDir);
    HashMap<String, String> sMap = new HashMap<>();
    sMap.put("first_name", "Salim");
    sMap.put("last_name", "Nader");
    sMap.put("email", "nader.s@northeastern.edu");
    testSupporter = new Supporter(sMap);
  }

  @Test
  public void generate() throws IOException {
    test.generate(testSupporter, "TESTFILE.txt");
  }

  @Test (expected = IOException.class)
  public void generateException() throws IOException {
    test.generate(testSupporter, "");
  }

  @Test
  public void testEqualsReflexivity() {
    assertTrue(test.equals(test));
  }

  @Test
  public void testEqualsSymmetry() {
    CommunicationGenerator test2 = new CommunicationGenerator(testTemplate, testDir);
    assertTrue(test.equals(test2) && test2.equals(test));
  }

  @Test
  public void testEqualsTransitivity() {
    CommunicationGenerator test2 = new CommunicationGenerator(testTemplate, testDir);
    CommunicationGenerator test3 = new CommunicationGenerator(testTemplate, testDir);
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
    assertFalse(test.equals(new CommunicationGenerator("", testDir)));
    assertFalse(test.equals(new CommunicationGenerator(testTemplate, "")));
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
    CommunicationGenerator test2 = new CommunicationGenerator(testTemplate, testDir);
    assertEquals(test.equals(test2), (test.hashCode() == test2.hashCode()));
  }

  @Test
  public void testToString() {
    String expected = "CommunicationGenerator{template='To:[[email]]\n"
        + "Subject: Spring sale!\n"
        + "Dear [[first_name]] [[last_name]],\n"
        + "Everything in our store will be 20% off between now and the end of April! Stock up on "
        + "our logo mugs, T shirts, and water bottles to show your support and help raise "
        + "awareness. Our magnets, plushies, and picture books, also make great gifts for the "
        + "children in your life. \n"
        + "\n"
        + "Remember, all proceeds go to support our work and, if we can reach our goal of $10,000 "
        + "in sales by the end of April, an anonymous donor has pledged to match every $1 you "
        + "spend. Want to help out but don’t want to buy stuff? Visit our website to make a "
        + "donation.\n"
        + "\n"
        + "Sincerely, \n"
        + "\n"
        + "Non-Profit Director', outputDirectory='OUTPUTS'}";
    assertEquals(expected, test.toString());
  }
}