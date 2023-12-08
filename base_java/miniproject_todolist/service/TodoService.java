package base_java.miniproject_todolist.service;

import java.util.*;
import base_java.miniproject_todolist.domain.TodoItem;
import base_java.miniproject_todolist.repository.TodoRepository;

public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void addTodo(TodoItem item) {
        todoRepository.addTodo(item);
    }

    public void deleteTodo(long id) {
        todoRepository.deleteTodo(id);
    }

    public void editTodo(TodoItem item) {
        todoRepository.editTodo(item);
    }

    public List<TodoItem> getAllTodos() {
        return todoRepository.getAllTodos();
    }
}
