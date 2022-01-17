package Problem2;

import java.util.Objects;

public class Node {
  private String value;
  private Node nextPointer;

  public Node(String value, Node nextPointer) {
    this.value = value;
    this.nextPointer = nextPointer;
  }

  public String getValue() {
    return value;
  }

  public Node getNextPointer() {
    return nextPointer;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setPointer(Node pointer) {
    this.nextPointer = pointer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(value, node.value) && Objects
        .equals(nextPointer, node.nextPointer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, nextPointer);
  }

  @Override
  public String toString() {
    return "Node{" +
        "value='" + value + '\'' +
        ", pointer=" + nextPointer +
        '}';
  }
}
