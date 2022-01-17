package problem1;

/**
 * An immutable Priority Queue. A Queue is FIFO (first-in, first-out) data structure.
 */
public interface IPriorityQueue {

  /**
   * Creates and returns an empty PQ.
   * @return an empty node.
   */
  static IPriorityQueue createEmpty(){
    return new EmptyNode();

  }
  /**
   * Checks to see if the Priority Queue is empty.
   */
  Boolean isEmpty();

  /**
   *Adds the given element (the priority and its associated value to the PQ)
   * @param priority - priority value.
   * @param value - the String value.
   * @return
   */
  IPriorityQueue add(Integer priority, String value);

  /**
   * Returns the value in the PQ that has the highest priority.
   * @return -returns the value with the highest priority.
   */
  String peek() throws EmptyQueueException;

  /**
   * Returns a copy of the PQ without the element with the highest priority
   * @return a copy of PQ without the element with the highest priority
   */
  IPriorityQueue pop()throws EmptyQueueException;
}
