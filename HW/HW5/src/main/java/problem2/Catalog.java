package problem2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a Catalog that stores a collection of items in the library.
 */
public class Catalog {
  private ArrayList <Items>library;

  public Catalog(){
    this.library = new ArrayList<>();

  }
  public Catalog(ArrayList<Items>library){
    this.library = library;
  }

  /**
   * Gets the library
   * @return library
   */
  public ArrayList<Items> getLibrary() {
    return library;
  }

  /**
   * Adds items to a list
   * @param items to put in a list
   */
  public void add(Items items){
    library.add(items);

  }

  /**
   * Removes an item in the list
   * @param items -to remove from a list
   */
  public void  remove(Items items){
    library.remove(items);
  }
  /**
   * Retrieves all items in the catalog regardless of the type.
   * @param keyword - search term.
   * @return - all items in the search containing the keyword.
   */
  public Catalog search(String keyword){
    ArrayList<Items> searchResults = new ArrayList<>();

    for(int i = 0; i < library.size(); i++) {
      if (library.get(i).getTitle().toLowerCase().contains(keyword.toLowerCase())) {
        searchResults.add(library.get(i));
      }
    }

    return new Catalog(searchResults);
  }

  /**
   * This should retrieve all Book items in the catalog that has the exact match for the given author.
   * @param author - author of a book
   * @return - returns all items in the catalog that have an exact match
   */
  public Catalog search(Author author){
    ArrayList<Items> searchResults = new ArrayList<>();
    for (int i = 0; i < library.size(); i++){
      Items item = library.get(i);

      if (item instanceof Book) {
        Book book = (Book) item;
        Author bookAuthor = (Author) book.getCreator();
        if (author.equals(bookAuthor)) {
          searchResults.add(item);
        }
      }
    }
    return new Catalog(searchResults);
  }

  /**
   * Retrieves all Music items in the catalog that have an exact match for a given artist.
   * @param artist - artist under RecordingArtist.
   * @return - returns sole creator of Music or one member of a Band.
   */
  public Catalog search(RecordingArtist artist){
    ArrayList<Items> searchResults = new ArrayList<>();
    for(int i = 0; i < library.size(); i++){
      Items item = library.get(i);
      Creator creator = item.getCreator();

      if (creator instanceof Band){
        Band band = (Band) creator;

        if (band.findArtistInBand(artist)) {
          searchResults.add(item);
        }

      } else if (creator instanceof RecordingArtist) {
        if (creator.equals(artist)) {
          searchResults.add(item);
        }
      }
    }
    return new Catalog(searchResults);
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(library, catalog.library);
  }

  @Override
  public int hashCode() {
    return Objects.hash(library);
  }

  @Override
  public String toString() {
    return "Catalog{" +
        "library=" + library +
        '}';
  }
}
