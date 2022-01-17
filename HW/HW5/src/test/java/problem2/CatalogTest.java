package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CatalogTest {
  private Catalog library1, library2;
  private Book book1;
  private Author author1;
  private Music music1, music2;
  private RecordingArtist artist1, artist2, artist3;
  private Band band1;

  @Before
  public void setUp() throws Exception {
    author1 = new Author("Jane", "Doe");
    book1 = new Book(author1,"Mary's Lamb", 2018);
    artist1 = new RecordingArtist("Tom", "Hamilton");
    artist2 = new RecordingArtist("Steven", "Tyler");
    artist3 = new RecordingArtist("Annalise", "Keating");
    library1 = new Catalog();
    library2 = new Catalog();
    band1 = new Band("Aerosmith");
    band1.add(artist1);
    band1.add(artist2);
    music1 = new Music(band1,"Dream On", 1973);
    music2 = new Music(artist3,"I dont wanna miss a thing", 1998);

  }

  @Test
  public void search() {
    library1.add(book1);
    assertEquals(library1.getLibrary(),library1.search("Lamb").getLibrary());
  }

  @Test
  public void testSearch() {
    library1.add(book1);
    library1.add(music1);
    library1.add(music2);
    library1.remove(music2);

    library2.add(book1);
    library2.add(music1);

    assertEquals(library2, library1.search("a"));

  }

  @Test // Search Book author
  public void testSearch1() {
    library1.add(book1);
    library1.add(music1);
    library2.add(book1);
    assertEquals(library2.getLibrary(), library1.search(author1).getLibrary());
  }

  @Test // Search Music band
  public void tesSearch2(){
    library1.add(music1);
    library1.add(music2);

    library2.add(music1);
    assertEquals(library2.getLibrary(), library1.search(artist1).getLibrary());
  }

  @Test // Search Music Single artist
  public void tesSearch3(){
    library1.add(music2);

    library2.add(music2);
    assertEquals(library2,library1.search(artist3));
  }

  @Test
  public void testEquals() {
    assertTrue(library1.equals(library1));
    assertFalse(library1.equals(null));
    assertTrue(library1.equals(library2));

  }

  @Test
  public void testHashCode() {
    assertTrue(library1.hashCode() == library1.hashCode());
    assertTrue(band1.equals(band1));
  }

  @Test
  public void bookToString(){
    assertEquals("Items{creator=Creator{firstName='Jane', lastName='Doe'}, "
        + "title='Mary's Lamb', year=2018}", book1.toString());
  }
  @Test
  public void bookTestHashCode() {
    assertEquals(book1.hashCode(), book1.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Catalog{library=[]}",library1.toString());
  }
}