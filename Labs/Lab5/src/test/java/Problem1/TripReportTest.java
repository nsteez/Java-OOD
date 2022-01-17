package Problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TripReportTest {
  Bus bus1;

  @Before
  public void setUp() throws Exception {
    bus1 = new Bus("2345",30f,80f);
  }

  @Test
  public void getTrip() {
    assertEquals("2345", bus1.getId());

  }

  @Test
  public void getAverageSpeed() {
    assertEquals(30f, bus1.getAverageSpeed(), 0);
  }

  @Test
  public void getDistance() {
    assertEquals(80f, bus1.getMaxSpeed(), 0);
  }

  @Test
  public void getTripDuration() {
  }

  @Test
  public void validateDistance() {
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