package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BandTest {
  //private Catalog library1;
  private Band band1, sameBand;
  private RecordingArtist artist1, artist2;
  private Music music1;

  @Before
  public void setUp() throws Exception {
    artist1 = new RecordingArtist("Tom", "Hamilton");
    artist2 = new RecordingArtist("Steven", "Tyler");
    band1 = new Band("Aerosmith");
    sameBand = new Band("Aerosmith");
    //band1.add(artist1);
    //band1.add(artist2);
    music1 = new Music(band1,"Dream On", 1973);
  }

  @Test
  public void add() {

  }

  @Test
  public void remove() {
    band1.add(artist1);
    band1.add(artist2);
    band1.remove(artist2);

    sameBand.add(artist1);
    assertEquals(band1, sameBand);

  }

  @Test
  public void getName() {
    assertEquals("Aerosmith",band1.getName());
  }

  @Test
  public void findArtistInBand() {
  }

  @Test
  public void testEquals() {
    assertTrue(band1.equals(band1));
    assertFalse(band1.equals(null));
    band1.add(artist1);
    assertFalse(band1.equals(sameBand));

  }

  @Test
  public void testHashCode() {
    assertTrue(band1.hashCode()== band1.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals(band1.toString(),sameBand.toString());
  }
}