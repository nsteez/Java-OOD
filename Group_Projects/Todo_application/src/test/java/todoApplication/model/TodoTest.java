package todoApplication.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import todoApplication.model.Todo;
import todoApplication.view.DisplayTodos;

public class TodoTest {
  private Todo one, two, three, four, five,six;
  private List<Todo> todoList1;

  @Before
  public void setUp() throws Exception {
    one = new Todo("Finish HW9",false, LocalDate.of(2020,3,22),1,"school");
    two =  new Todo("Mail Passport",true, LocalDate.of(2020,2,28),null,null);
    three = new Todo("Study for finals",false, null,2,"school");
    four = new Todo("Clean the house",false,LocalDate.of(2020,5,21),3,"home");
    five = new Todo("Buy yarn for blanket, stuffed toy",true,null,null,"home");
    six = new Todo("Clean the house",false,LocalDate.of(2020,5,21),2,"home");


    todoList1 = new ArrayList<>();
    todoList1.add(one);
    todoList1.add(two);
    todoList1.add(three);
    todoList1.add(four);
    todoList1.add(five);

  }

  @Test
  public void getText() {
    assertEquals("Clean the house",four.getText());
    
  }

  @Test
  public void getCompleted() {
    assertEquals(false, four.getCompleted());
  }

  @Test
  public void getDue() {
    assertEquals(LocalDate.of(2020,05,21), four.getDue());
  }

  @Test
  public void getPriority() {
    assertEquals((Integer)3, four.getPriority());
  }

  @Test
  public void getCategory() {
    assertEquals("home", four.getCategory());
  }

  @Test
  public void setCompleted() {
    four.setCompleted(true);
    assertEquals(true, four.getCompleted());
  }

  @Test
  public void getComparePriority() {
    for (Todo t1: todoList1) {
      System.out.println(t1);
    }
    System.out.println("---");
    DisplayTodos.displayTodosSortByPriorityAscending(todoList1);

    for (Todo t1: todoList1) {
      System.out.println(t1);
    }
  }

  @Test
  public void getCompareDate() {
    for (Todo t1: todoList1) {
      System.out.println(t1);
    }
    System.out.println("---");
    DisplayTodos.displayTodosSortByDateAscending(todoList1);

    for (Todo t1: todoList1) {
      System.out.println(t1);
    }
  }

  @Test
  public void DisplayCategory(){
    List<Todo> todos = DisplayTodos.displayTodosFilterByCategory(todoList1, "school");
    for (Todo td : todos)
    {
      System.out.println(td);
    }

  }

  @Test
  public void testEquals() {
    assertTrue(four.equals(four));
    assertFalse(four.equals(null));
    assertFalse(four.equals(five));
    assertFalse(four.equals(todoList1));
    assertFalse(four.equals(six));
    assertFalse(four.equals(new Todo("Clean the house",false,
        LocalDate.of(2020,5,21),3,"vacation home")));
  }


  @Test
  public void testHashCode() {
    assertTrue(four.hashCode() == four.hashCode());
  }

  @Test
  public void testToString() {
    assertEquals("Clean the house  false  2020-05-21  3  home" ,four.toString());
  }
}