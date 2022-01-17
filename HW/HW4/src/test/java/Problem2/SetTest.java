package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SetTest {
  ISet empty;
  ISet setOne;

  @Before
  public void setUp() throws Exception {
    empty = ISet.emptySet();
    setOne = ISet.emptySet();
    setOne.add(5);
    setOne.add(10);
  }



  @Test
  public void isEmpty() {
    assertEquals(true,empty.isEmpty());

  }

  @Test
  public void add() throws DuplicateException{
    empty.add(2);
    empty.add(4);
    assertEquals((Integer) 2,empty.size());

  }

  @Test(expected = DuplicateException.class)
    public void invalidAdd() throws DuplicateException {
    empty.add(2);
    empty.add(2);
  }

  @Test
  public void contains() {
    assertTrue("true",setOne.contains(5));
    assertTrue("true", setOne.contains(10));
    assertFalse("false", setOne.contains(6));
  }

  @Test
  public void remove() throws IntegerNotFoundException,DuplicateException{
    setOne.add(15);
    setOne.remove(15);
    assertFalse(setOne.contains(15));
    setOne.remove(5);
    assertFalse(setOne.contains(5));
    //assertTrue(setOne.isEmpty());
  }


  @Test(expected = IntegerNotFoundException.class)
  public void NotFoundRemove() throws IntegerNotFoundException{
    setOne.remove(222);
  }

  @Test
  public void size() {
    assertTrue(setOne.size() == 2);
    assertTrue(empty.size() == 0);
  }
}