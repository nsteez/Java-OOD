package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementNodeTest {

  private IPriorityQueue test, testCopy;
  private IPriorityQueue emptyQueue;


  @Before
  public void setUp() throws Exception {
    emptyQueue = new EmptyNode();
    test = new ElementNode(2, "get juice", new EmptyNode());
    testCopy = new ElementNode(2, "get juice", new EmptyNode());
  }

  @Test
  public void isEmpty() {
    assertTrue(emptyQueue.isEmpty());
    assertFalse(test.isEmpty());
  }

  @Test
  public void add() throws EmptyQueueException {
    test = test.add(5, "get tomato");
    test = test.add(3, "get salt");
    assertEquals("get juice", test.peek());
  }

  @Test
  public void peek() throws EmptyQueueException {
      test = test.add(10, "get pepper");
      test = test.add(1, "get broccoli");
      test = test.add(3, "get rice");
      assertEquals("get broccoli", test.peek());
    }


  @Test(expected = EmptyQueueException.class)
  public void invalidPeek() throws EmptyQueueException {
      emptyQueue.peek();
  }

  @Test
  public void pop() throws EmptyQueueException{
    test = test.add(10, "get pepper");
    test = test.add(9, "get carrot");
    test = test.pop();
    assertEquals("get carrot", test.peek());

  }

  @Test(expected = EmptyQueueException.class)
  public void invalidPop() throws  EmptyQueueException{
    emptyQueue.pop();
  }

  @Test
  public void testToString() {
    assertEquals(test.toString(), test.toString());
  }

  @Test
  public void testEquals() {
    assertTrue(test.equals(test));
    assertFalse(test.equals(emptyQueue));
    assertFalse(test.equals(null));
    assertTrue(test.equals(testCopy));
  }

  @Test
  public void testHashCode() {
    assertTrue(emptyQueue.hashCode() == emptyQueue.hashCode());
   // assertTrue(test.hashCode() == new ElementNode(2, "get juice", new EmptyNode()).hashCode());
  }
}