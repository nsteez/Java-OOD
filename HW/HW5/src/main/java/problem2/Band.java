package problem2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents members of a band under Recording artist.
 */
public class Band extends Creator{
  private String name;
  private ArrayList<RecordingArtist> artists;

  public Band(String name){
    super("", "");
    this.name = name;
    this.artists = new ArrayList<>();
  }

  /**
   * Adds an artist to the Band ArrayList
   * @param artist - an artist
   */
  public void add(RecordingArtist artist){
    artists.add(artist);

  }

  /**
   * Removes an artist from the Band Arraylist
   * @param artist - an artist
   */
  public void  remove(RecordingArtist artist){
    artists.remove(artist);
  }

  /**
   * Gets name of Band
   * @return band name.
   */
  public String getName() {
    return name;
  }

  /**
   * Find an artist in the Band arrayList
   * @param artist an artist.
   * @return artist in the arryaList
   */
  public boolean findArtistInBand(RecordingArtist artist) {
    return artists.contains(artist);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Band band = (Band) o;
    return Objects.equals(name, band.name) && Objects.equals(artists, band.artists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, artists);
  }

  @Override
  public String toString() {
    return "Band{" +
        "name='" + name +
        ", artist=" + artists +
        '}';
  }
}
