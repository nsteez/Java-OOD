package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringListTest {
  private Node node1, node2, node3, node4, node5;
  private StringList list1;

  @Before
  public void setUp() throws Exception {
    node5 = new Node("Butter",null);
    node4 = new Node("Phone",null);

    node3 = new Node("Remote",null);
    node2 = new Node("Remote",null);
    node1 = new Node("Altoids",null);

  }

  @Test
  public void hasDuplicates() {
    list1 = new StringList();
    list1.addElement("Altoids");
    list1.addElement("Altoids");
    assertTrue(list1.hasDuplicates());

    list1 = new StringList();
    list1.addElement("Altoids");
    list1.addElement("Altoiddds");
    assertFalse(list1.hasDuplicates());
  }
}