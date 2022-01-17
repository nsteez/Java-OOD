package problem2;

import java.util.Objects;

public class ElementNodeM implements IBagOfWords{
  private String word;
  private IBagOfWords next;

  public ElementNodeM(String word, IBagOfWords next){
    this.word = word;
    this.next = next;
  }

  /**
   * Checks if the BagOfWords is empty.
   *
   * @return Returns true if the BagOfWords contains no items, false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Returns the number of elements in the BagOfWords. Duplicates counted as separate elements.
   *
   * @return size
   */
  @Override
  public Integer size() {
    return 1 + this.next.size();
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
    if(this.word.compareTo(word) > 0){
      return new ElementNodeM(word,this);
  } else{
      return new ElementNodeM(this.word, this.next.add(word));
    }

  }

  /**
   * Checks if word is in the BagOfWords.
   *
   * @param word the String to check.
   * @return Returns true if the BagOfWords contains s, and false otherwise.
   */
  @Override
  public Boolean contains(String word) {
    if (isEmpty()){
      return false;
    }else{
      if (!this.word.equals(word)){
        return this.next.contains(word);
      }
      return true;
    }
  }

  @Override
  public String toString() {
    return
        " word: " + word +
        ", next: " + next;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementNodeM that = (ElementNodeM) o;
    return Objects.equals(word, that.word) && Objects.equals(next, that.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, next);
  }
}
