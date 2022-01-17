package problem2;

/**
 * Represents a RecordingArtist or a Band.
 */
public class Music extends Items{

  public Music(RecordingArtist artist, String title, Integer year) {
    super(artist, title, year);
  }

  public Music(Band band, String title, Integer year) {
    super(band, title, year);
  }
}
