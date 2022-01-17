package problem1;

public class ElementNode implements ILinkedList{
  private Integer element;
  private ILinkedList next;

  public ElementNode(Integer element, ILinkedList next){
    this.element = element;
    this.next = next;
  }


  /**
   * Returns the number of elements in the LinkedList
   *
   * @return Integer
   */
  @Override
  public Integer count() {
    return 1 + this.next.count();
  }

  /**
   * Returns true if the elements is in the list and false otherwise.
   *
   * @param element - the element to search
   * @return boolean
   */
  @Override
  public Boolean contains(Integer element) {
    if(this.element == element){
      return true;
    }
    if(this.next == null){
      return false;
    } else {
      return this.next.contains(element);
    }
  }

  /**
   * Returns the element found at index in the list
   *
   * @param index - index to search
   * @throws IndexOutOfBoundsException - if index is not found.
   */
  @Override
  public Integer elementAt(Integer index) throws IndexOutOfBoundsException {
    if(index < 0 || index > this.count())
      throw new IndexOutOfBoundsException();
    //else if (this.element[index]== index){
    else if (index.equals(0)) {
      return this.element;
    } else {
      return this.next.elementAt(index - 1);

    }
  }
}
