package problem2;

import java.util.Objects;

public class EmptyNodeM implements IBagOfWords{



  /**
   * Checks if the BagOfWords is empty.
   *
   * @return Returns true if the BagOfWords contains no items, false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Returns the number of elements in the BagOfWords. Duplicates counted as separate elements.
   *
   * @return size
   */
  @Override
  public Integer size() {
    return 0;
  }

  /**
   * Adds a string to the BagOfWords
   *
   * @param word - the String to add
   * @return - Returns a new BagOfWords that contains all elements in the original BagOfWords plus
   * s.
   */
  @Override
  public IBagOfWords add(String word) {
    return new ElementNodeM(word,this);
  }

  /**
   * Checks if s is in the BagOfWords.
   *
   * @param word the String to check.
   * @return Returns true if the BagOfWords contains s, and false otherwise.
   */
  @Override
  public Boolean contains(String word) {
    return false;
  }

  @Override
  public String toString() {
    return "EmptyNodeM{}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    return true;
  }
}
