package Problem2;


/**
 * Represents a Set, as a mathematical notion of a set.
 */
public class Node {
  private Integer num;
  private Node pointerToNext;

  /**
   * Constructor for a Node.
   * @param num - the num to store.
   * @param pointerToNext - A reference to the next Node, if any.
   */
  public Node(Integer num, Node pointerToNext){
    this.num = num;
    this.pointerToNext = pointerToNext;
  }

  /**
   * Gets the num in the Node.
   * @return
   */
  public Integer getNum() {
    return this.num;
  }

  /**
   * Gets the next Node.
   * @return The next Node is present.
   */
  public Node getPointerToNext() {
    return this.pointerToNext;
  }

  /**
   * Sets the next Node.
   * @param pointerToNext - The next Node
   */
  public void setPointerToNext(Node pointerToNext) {
    this.pointerToNext = pointerToNext;
  }
}
