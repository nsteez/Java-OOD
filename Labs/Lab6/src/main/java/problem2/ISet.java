package problem2;

/**
 * Set, as a mathematical notion
 */
public interface ISet {

  /**
   * Creates an empty Set
   */
  static ISet emptySet(){
    return new EmptyNodeSet();
  }


  /**
   * Checks to see if the Set is empty
   */
  Boolean isEmpty();

  /**
   * Adds a number to a set, if number doesnt already exist in a set.
   * @param num - to add
   * @return boolean
   */
  ISet add(Integer num)throws IllegalArgumentException;

  /**
   * Boolean to check that an integer exist in the set.
   * @param num to check
   * @return boolean
   */
  Boolean contains(Integer num);

  /**
   * Removes a num in the set.
   * @param num
   * @return
   */
  ISet remove(Integer num);

  /**
   * Returns the size.
   * @return Integer
   */
  Integer size();

}
