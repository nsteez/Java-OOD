package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElementNodeMTest {
  private IBagOfWords group1;
  private IBagOfWords group2;
  private IBagOfWords emptyGroup;

  @Before
  public void setUp() throws Exception {
    emptyGroup = new EmptyNodeM();
    group1 = new ElementNodeM("salt",new EmptyNodeM());
    group2 = new ElementNodeM("salt",new EmptyNodeM());
  }

  @Test
  public void isEmpty() {
    assertTrue(emptyGroup.isEmpty());
    group1.add("basil");
    assertFalse(group1.isEmpty());

  }

  @Test
  public void size() {
    assertEquals((Integer) 1,group1.size());
    group2 = group2.add("pepper");
    assertEquals((Integer) 2,group2.size());
  }

  @Test
  public void add() {
    group2 = group2.add("pepper");
    group2 = group2.add("garlic");
    group2 = group2.add("red pepper");
    group2 = group2.add("Cajun");
    assertEquals((Integer) 5, group2.size());
  }

  @Test
  public void contains() {
    group2 = group2.add("pepper");
    group2 = group2.add("garlic");
    group2 = group2.add("red pepper");
    //System.out.println(group2.toString());
    assertTrue(group2.contains("pepper"));
    assertFalse(emptyGroup.contains("garlic"));
  }

  @Test
  public void testToString() {
    assertEquals(" word: salt, next: EmptyNodeM{}",group1.toString());
  }

  @Test
  public void testEquals() {
    group2 = group2.add("pepper");
    group2 = group2.add("garlic");
    group2 = group2.add("red pepper");
    group2 = group2.add("garlic");

    group1 = group1.add("garlic");
    group1 = group1.add("pepper");
    group1 = group1.add("red pepper");
    group1 = group1.add("garlic");

    assertTrue(group1.equals(group2));
    assertFalse(group1.equals(emptyGroup));
    assertFalse(group1.equals(null));
    assertTrue(group1.equals(group1));

  }

  @Test
  public void testHashCode() {
  }
}