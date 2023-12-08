package base_java.miniproject_todolist.service;

import base_java.miniproject_todolist.repository.TodoRepository;

public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
}
