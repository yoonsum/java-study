package base_java.miniproject_todolist.repository;

import java.util.*;

import base_java.miniproject_todolist.domain.TodoItem;

public class InMemoryTodoRepository implements TodoRepository {

    private Map<Long, TodoItem> todoList;
    private long id;

    public InMemoryTodoRepository() {
        this.todoList = new HashMap<>();
        this.id = 1;
    }

    @Override
    public void addTodo(TodoItem item) {
        item.setId(id++);
        todoList.put(item.getId(), item);
    }

    @Override
    public void deleteTodo(long id) {
        todoList.remove(id);
    }

    @Override
    public void editTodo(TodoItem item) {
        todoList.put(item.getId(), item);
    }

    @Override
    public List<TodoItem> getAllTodos() {
        return new ArrayList<>(todoList.values());
    }

    @Override
    public TodoItem getTodoById(long id) {
        return todoList.get(id);
    }
}
