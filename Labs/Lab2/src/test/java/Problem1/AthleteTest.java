package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AthleteTest {
  private Name expectedName = new Name("Jill", "Robin", "Hood");
  private Double expectedHeight = 5.8;
  private Double expectedWeight = 140.0;
  private String expectedLeague = "MLB";
  private Athlete testAthlete;

  @Before
  public void setUp() throws Exception {
    testAthlete = new Athlete(expectedName, expectedHeight, expectedWeight, expectedLeague);
  }

  @Test
  public void getAthletesName() {
    assertEquals(expectedName,testAthlete.getAthletesName());
  }

  @Test
  public void getHeight() {
    assertEquals(expectedHeight,testAthlete.getHeight());
  }

  @Test
  public void getWeight() {
    assertEquals(expectedHeight,testAthlete.getHeight());

  }
  @Test
  public void getLeague(){
    assertEquals(expectedLeague,testAthlete.getLeague());
  }

  @Test
  public void testEqualsReflexivity() {
    assertTrue(testAthlete.equals(testAthlete));
  }

  @Test
  public void testEqualsSymmetry() {
    Athlete testAthlete2 = new Athlete(expectedName,expectedHeight,
        expectedWeight,expectedLeague);
    assertTrue(testAthlete.equals(testAthlete2) && testAthlete2.equals(testAthlete));
  }

  @Test
  public void testEqualsTransitivity() {
    Athlete testAthlete2 = new Athlete(expectedName,expectedHeight,
        expectedWeight,expectedLeague);
    Athlete testAthlete3 = new Athlete(expectedName,expectedHeight,
        expectedWeight,expectedLeague);
    assertTrue(testAthlete.equals(testAthlete2) && testAthlete2.equals(testAthlete3)
        && testAthlete.equals(testAthlete3));

  }
  @Test
  public void testEqualsNullReference() {
    assertFalse(testAthlete.equals(null));
  }

  @Test
  public void testHashCode() {
    Athlete testAthlete4 = new Athlete(expectedName,expectedHeight,
        expectedWeight,expectedLeague);
    assertTrue(testAthlete4.equals(testAthlete4));
  }

}