package problem1;

import java.util.Objects;

public class ElementNode implements IPriorityQueue{
  private Integer priority;
  private String value;
  private IPriorityQueue next;

  public ElementNode(Integer priority, String value, IPriorityQueue next){
    this.priority = priority;
    this.value = value;
    this.next = next;

  }

  /**
   * Checks to see if the Priority Queue is empty.
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Adds the given element (the priority and its associated value to the PQ)
   *
   * @param priority - priority value.
   * @param element - the String element.
   * @return
   */
  @Override
  public IPriorityQueue add(Integer priority, String element) {
    if (priority < this.priority){
      return new ElementNode(priority, element, this);
    }
    this.next = this.next.add(priority, element);
    return this;
  }

  /**
   * Returns the value in the PQ that has the highest priority.
   *
   * @return -returns the value with the highest priority.
   * @throws EmptyQueueException if Queue is empty
   */
  @Override
  public String peek() throws EmptyQueueException{
    return this.value;
  }

  /**
   * Returns a copy of the PQ without the element with the highest priority
   *
   * @return a copy of PQ without the element with the highest priority
   * @throws EmptyQueueException if Queue is empty
   */
  @Override
  public IPriorityQueue pop()throws EmptyQueueException {
    IPriorityQueue copy = this.next;
    return copy;

  }

  @Override
  public String toString() {
    return
        "Priority: " + priority +
        ", value: '" + value +
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
    ElementNode that = (ElementNode) o;
    return Objects.equals(priority, that.priority) && Objects
        .equals(value, that.value) && Objects.equals(next, that.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, value, next);
  }
}
