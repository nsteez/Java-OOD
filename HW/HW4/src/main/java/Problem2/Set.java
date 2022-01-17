package Problem2;

public class Set implements ISet {

  private Node head;
  private int numNodes;

  public Set() {
    this.head = null;
    this.numNodes = 0;
  }

  /**
   * Checks if the Set is empty.Returns true if the Set contains no items, false otherwise.
   * @return
   */
  @Override
  public Boolean isEmpty() {
    return head == null;
  }

  /**
   * Adds the given Integer to the Set if and only if that Integer is not already in the set.
   * @param num - number to add to the set
   */
  @Override
  public void add(Integer num)throws DuplicateException {
    if (contains(num)){
      throw new DuplicateException();
    }
    Node newNode = new Node(num, null);
    if (this.head == null)
      this.head = newNode;
    else {
      Node currentNode = this.head;
      while (currentNode.getPointerToNext() != null) {
        currentNode = currentNode.getPointerToNext();
      }
      currentNode.setPointerToNext(newNode);
    }
    this.numNodes++;
  }

  /**
   * Returns true if the given Integer is in the Set.
   *
   * @param num - number to check.
   * @return true if the given is in the set, false otherwise.
   */
  @Override
  public Boolean contains(Integer num) {
    if (isEmpty())
      return false;
    else {
      Node temporaryNode = this.head;
      while (temporaryNode != null) {
        if (temporaryNode.getNum().equals(num))
          return true;
        temporaryNode = temporaryNode.getPointerToNext();
      }
    }
    return false;

  }

  /**
   * Returns a copy of the Set with the given Integer removed. If the given Integer is not in the
   * Set, return the Set as is.
   *
   * @param num - number to remove
   */
  @Override
  public void remove(Integer num) throws IntegerNotFoundException {
    if (contains(num) == false){
      throw new IntegerNotFoundException();
    }
    if (this.head.getNum() == num){
      this.head = this.head.getPointerToNext();
      return;
    }
    Node temporaryNode = this.head;
    while(temporaryNode.getPointerToNext() != null){
      if(temporaryNode.getPointerToNext().getNum() == num){
        temporaryNode.setPointerToNext(temporaryNode.getPointerToNext().getPointerToNext());
        return;
      }
      temporaryNode = temporaryNode.getPointerToNext();
    }
  }

  /**
   * Gets the number of items in the Set.
   *
   * @return size of set
   */
  @Override
  public Integer size() {
    if (isEmpty())
      return 0;
    else {
      Integer size = 1;
      Node temporaryNode = this.head;
      while (temporaryNode.getPointerToNext() != null) {
        size++;
        temporaryNode = temporaryNode.getPointerToNext();
      }
      return size;
    }
  }

}
