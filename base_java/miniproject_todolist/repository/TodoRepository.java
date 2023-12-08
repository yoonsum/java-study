package base_java.miniproject_todolist.repository;

import java.util.*;
import base_java.miniproject_todolist.domain.TodoItem;

public interface TodoRepository {
    void addTodo(TodoItem item);

    void editTodo(TodoItem item);

    void deleteTodo(int id);

    List<TodoItem> getAllTodos();

    TodoItem getTodoById(int id);
}
