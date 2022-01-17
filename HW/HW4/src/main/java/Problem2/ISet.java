package Problem2;

/**
 *A LinkedList represents a mathematical notion of a set.
 */
public interface ISet {

  /**
   * Creates  and returns an empty Set.
   */

  static Set emptySet() {
    return new Set();

  }
  /**
   * Checks if the Set is empty.Returns true if the Set contains no items, false otherwise.
   * @return
   */
  Boolean isEmpty();

  /**
   * Adds the given Integer to the Set if and only if that Integer is not already in the set.
   * @param num - number to add to the set
   */
  void add(Integer num) throws DuplicateException;

  /**
   * Returns true if the given Integer is in the Set.
   * @param num - number to check.
   * @return true if the given is in the set, false otherwise.
   */
  Boolean contains(Integer num);

  /**
   * Returns a copy of the Set with the given Integer removed.
   * If the given Integer is not in the Set, return the Set as is.
   * @param num - number to remove
   */
  void remove(Integer num)throws IntegerNotFoundException;

  /**
   * Gets the number of items in the Set.
   * @return size of set
   */
  Integer size();

}
