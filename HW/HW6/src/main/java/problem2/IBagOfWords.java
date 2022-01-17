package problem2;

/**
 * An immutable multiset
 */
public interface IBagOfWords {

  /**
   * Creates and returns an empty BagOfWords
   * @return empty BagOfWords
   */
  static IBagOfWords emptyBagOfWords(){
    return new EmptyNodeM();
  }

  /**
   * Checks if the BagOfWords is empty.
   * @return Returns true if the BagOfWords contains no items, false otherwise.
   */
  Boolean isEmpty();

  /**
   * Returns the number of elements in the BagOfWords.
   * Duplicates counted as separate elements.
   * @return size
   */
  Integer size();

  /**
   * Adds a string to the BagOfWords
   * @param s - the String to add
   * @return - Returns a new BagOfWords that contains all elements
   * in the original BagOfWords plus s.
   */
  IBagOfWords add(String s);

  /**
   * Checks if s is in the BagOfWords.
   * @param s the String to check.
   * @return Returns true if the BagOfWords contains s, and false otherwise.
   */
  Boolean contains(String s);


}
