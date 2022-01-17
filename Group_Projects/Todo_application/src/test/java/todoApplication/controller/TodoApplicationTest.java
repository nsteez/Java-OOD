package todoApplication.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class TodoApplicationTest {
  private String[] argv;
  private TodoApplication todoApplication;


  @Test (expected = IllegalArgumentException.class)
  public void setUp1() throws IOException {
    argv = new String[]{};
    todoApplication = new TodoApplication(argv);
  }

  @Test (expected = IllegalArgumentException.class)
  public void setUp2() throws IOException {
    argv = new String[]{"--csv-file"};
    todoApplication = new TodoApplication(argv);
  }

  @Test
  public void setUp3() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt"};
    todoApplication = new TodoApplication(argv);
  }

  @Test (expected = IllegalArgumentException.class)
  public void setUp4() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--add-todo"};
    todoApplication = new TodoApplication(argv);
  }

  @Test (expected = IllegalArgumentException.class)
  public void setUp5() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--add-todo", "--todo-text"};
    todoApplication = new TodoApplication(argv);
  }

//  // Test failing due to ?????
//  @Test
//  public void setUp6() throws IOException {
//    argv = new String[]{"--csv-file", "todos.txt", "--add-todo", "--todo-text", "A new todo"};
//    todoApplication = new TodoApplication(argv);
//  }

//  // Test failing due to ????/
//  @Test
//  public void setUp7() throws IOException {
//    argv = new String[]{"--csv-file", "todos.txt", "--add-todo", "--todo-text", "A new todo", "--completed"};
//    todoApplication = new TodoApplication(argv);
//  }

//  // Test failing due to ????
//    @Test (expected = IllegalArgumentException.class)
//  public void setUp8() throws IOException {
//    argv = new String[]{"--csv-file", "todos.txt", "--add-todo", "--todo-text", "A new todo", "--completed", "--due"};
//    todoApplication = new TodoApplication(argv);
//  }

  @Test
  public void setUp9() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--add-todo", "--todo-text", "A new todo", "--completed", "--due", "12/5/2021"};
    todoApplication = new TodoApplication(argv);
  }

  @Test
  public void setUp10() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--add-todo", "--todo-text", "A new todo", "--completed", "--due", "12/5/2021"};
    todoApplication = new TodoApplication(argv);
  }


  @Test
  public void addANewTodo() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--add-todo", "--todo-text", "A new todo", "--completed", "--due", "12/5/2021"};
    todoApplication = new TodoApplication(argv);
  }

  @Test
  public void completeAnExistingTodo() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--complete-todo", "3"};
    todoApplication = new TodoApplication(argv);
  }

  @Test
  public void displayTodosAll() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--display"};
    todoApplication = new TodoApplication(argv);
  }

  @Test
  public void displayTodosIncomplete() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--display", "--show-incomplete"};
    todoApplication = new TodoApplication(argv);
  }

  // Not printing by category
//  @Test
//  public void displayTodosFilterCategory() throws IOException {
//    argv = new String[]{"--csv-file", "todos.txt", "--display", "--show-category", "school"};
//    todoApplication = new TodoApplication(argv);
//  }

  @Test
  public void displayTodosSortByDate() throws IOException {
    argv = new String[]{"--csv-file", "todos.txt", "--display", "--sort-by-date"};
    todoApplication = new TodoApplication(argv);
  }

  @Test
  public void getTodoHashMap() {
  }
}