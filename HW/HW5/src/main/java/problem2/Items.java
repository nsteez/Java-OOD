package problem2;

import java.util.Objects;

public abstract class Items {
  private Creator creator;
  private String title;
  private Integer year;

  public Items(Creator creator, String title, Integer year){
    this.creator = creator;
    this.title = title;
    this.year = year;
  }

  /**
   * Gets the creator
   * @return - the creator
   */
  public Creator getCreator() {
    return creator;
  }

  /**
   * Gets the title
   * @return - the title
   */
  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Items items = (Items) o;
    return Objects.equals(creator, items.creator) && Objects
        .equals(title, items.title) && Objects.equals(year, items.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, title, year);
  }


  @Override
  public String toString() {
    return "Items{" +
        "creator=" + creator +
        ", title='" + title + '\'' +
        ", year=" + year +
        '}';
  }
}
