package todoApplication.view;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import todoApplication.model.Todo;

import java.util.HashMap;
import todoApplication.model.Todo.CompareDate;
import todoApplication.model.Todo.ComparePriority;

/**
 * Class to display the Todos in the TodoApplication and support the view component of MVC architecture.
 */
public abstract class DisplayTodos {


    /**
     * Display all Todos in the TodoApplication.
     *
     * @param todoList The todoList to display.
     * @return result of allTodo.
     */
    public static List<Todo> displayAllTodos(List<Todo>todoList) {
        Predicate<Todo> allTodo = todo -> true;
        List<Todo> result = todoList.stream().filter(allTodo).collect(Collectors.toList());
        return result;
    }

    /**
     * Display all incomplete Todos.
     *
     * @param todoList The todoList to display.
     * @return result of filtering by incomplete status.
     */
    public static List<Todo> displayIncompleteTodos(List<Todo> todoList) {
        Predicate<Todo> byComplete = todo -> !todo.getCompleted();
        List<Todo> result = todoList.stream().filter(byComplete).collect(Collectors.toList());
        return result;
    }

    /**
     * Display Todos with a specific category.
     *
     * @param todoList The todoList to filter and display.
     * @param category The category of interest to display.
     * @return result of filtering by category.
     */
    public static List<Todo> displayTodosFilterByCategory(List<Todo> todoList, final String category) {
        Predicate<Todo> byCategory = todo -> todo.getCategory() == null ? false :
            todo.getCategory().equals(category);
        List<Todo> result = todoList.stream().filter(byCategory).collect(Collectors.toList());
        return result;
    }

    /**
     * Display Todos after sorting by ascending date.
     * @param todoList The todoList to sort and display.
     * @return todoList sorted by date.
     */
    public static List<Todo> displayTodosSortByDateAscending(List<Todo> todoList) {
        todoList.sort(new CompareDate());
        return todoList;

    }

    /**
     * Display Todos after sorting by priority: 1 is high priority, 3 is low priority, null priority is regarded as 3.
     * @param todoList The todoList to sort and display.
     * @return todoList sorted by priority.
     */
    public static List<Todo> displayTodosSortByPriorityAscending(List<Todo> todoList) {
        todoList.sort(new ComparePriority());
        return todoList;
    }
}
