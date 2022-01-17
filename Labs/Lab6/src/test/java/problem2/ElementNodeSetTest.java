package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementNodeSetTest {
  private ISet test;
  private ISet emptySet;

  @Before
  public void setUp() throws Exception {
    emptySet = new EmptyNodeSet();
    test = new ElementNodeSet(100, new EmptyNodeSet());
  }

  @Test
  public void emptySet() {
  }

  @Test
  public void isEmpty() {
  }

  @Test
  public void add() throws IllegalArgumentException{
    test = test.add(200);
    assertTrue(test.contains(200));
    //assertEquals("true", test.contains(200));
  }

  @Test
  public void contains() {
    assertTrue(test.contains(100));
  }

  @Test
  public void remove() {
    test = test.add(200);
    test = test.remove(200);
    assertFalse(test.contains(200));
  }

  @Test
  public void size() {
  }
}