package problem1;

public class EmptyNode implements IPriorityQueue {

  public EmptyNode() {

  }

  /**
   * Checks to see if the Priority Queue is empty.
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Adds the given element (the priority and its associated value to the PQ)
   *
   * @param priority - priority value.
   * @param element  - the String element.
   * @return
   */
  @Override
  public IPriorityQueue add(Integer priority, String element) {
    return new ElementNode(priority, element, this);
  }

  /**
   * Returns the value in the PQ that has the highest priority.
   *
   * @return -returns the value with the highest priority.
   */
  @Override
  public String peek() throws EmptyQueueException {
    throw new EmptyQueueException();
  }

  /**
   * Returns a copy of the PQ without the element with the highest priority
   *
   * @return a copy of PQ without the element with the highest priority
   */
  @Override
  public IPriorityQueue pop() throws EmptyQueueException{
    throw new EmptyQueueException();
  }


  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    return true;
  }

}

