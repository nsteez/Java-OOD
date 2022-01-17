package problem1;

public class EmptyNode implements ILinkedList {

  public EmptyNode(){

  }

  /**
   * Returns the number of elements in the LinkedList
   *
   * @return Integer
   */
  @Override
  public Integer count() {
    return 0;
  }

  /**
   * Returns true if the elements is in the list and false otherwise.
   *
   * @param element - the element to search
   * @return boolean
   */
  @Override
  public Boolean contains(Integer element) {
    return false;
  }

  /**
   * Returns the element found at index in the list
   *
   * @param index - index to search
   * @throws IndexOutOfBoundsException - if index is not found.
   */
  @Override
  public Integer elementAt(Integer index) throws IndexOutOfBoundsException {
    return null;

  }
}
