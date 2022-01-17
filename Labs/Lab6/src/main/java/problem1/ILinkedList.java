package problem1;

public interface ILinkedList {

  /**
   * Returns the number of elements in the LinkedList
   * @return Integer
   */
  Integer count();
  /**
   * Returns true if the elements is in the list and false otherwise.
   * @param element - the element to search
   * @return boolean
   */
  Boolean contains(Integer element);

  /**
   * Returns the element found at index in the list
    * @param index - index to search
   * @throws IndexOutOfBoundsException - if index is not found.
   */
  Integer elementAt(Integer index) throws IndexOutOfBoundsException;


}
