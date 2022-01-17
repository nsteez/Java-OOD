package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementNodeTest {
  private ILinkedList test;
  private ILinkedList emptyTest;

  @Before
  public void setUp() throws Exception {
    emptyTest = new EmptyNode();
    test = new ElementNode(12,new EmptyNode());
  }


  @Test
  public void count(){
    assertEquals((Integer) 0,emptyTest.count());
    assertEquals((Integer) 1,test.count());
  }
  @Test
  public void contains() {
    assertTrue(test.contains(12));
  }

  @Test
  public void elementAt() {
    assertEquals((Integer)12,test.elementAt(0));

  }
}