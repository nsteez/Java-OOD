package Problem2;

import junit.framework.TestCase;

public class NodeTest extends TestCase {
  private Node node1, node2, node3, node4, node5;

  public void setUp() throws Exception {
    super.setUp();
    node5 = new Node("Butter",null);
    node4 = new Node("Phone",node5);

    node3 = new Node("Water",node4);
    node2 = new Node("Remote",node3);
    node1 = new Node("Altoids",node2);


  }

  public void testGetValue() {
    Node pointer = node1;
    int skip = 2;
    while (skip-- > 0){
      pointer = pointer.getNextPointer();
    }
    //pointer.setPointer(new Node("Bubble", null));
    assertEquals(" ",pointer.getValue());
  }

  public void testgetNextPointer() {

  }

  public void testSetValue() {
  }

  public void testSetPointer() {
  }

  public void testTestEquals() {
  }

  public void testTestHashCode() {
  }

  public void testTestToString() {
  }
}