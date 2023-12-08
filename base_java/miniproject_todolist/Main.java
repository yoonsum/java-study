package base_java.miniproject_todolist;

import base_java.miniproject_todolist.presentation.Menu;
import base_java.miniproject_todolist.repository.InMemoryTodoRepository;
import base_java.miniproject_todolist.service.TodoService;

public class Main {
    public static void main(String[] args) {
        TodoService todoService = new TodoService(new InMemoryTodoRepository());
        Menu menu = new Menu(todoService);

        while (true) {
            menu.displayMenu();
        }
    }
}
