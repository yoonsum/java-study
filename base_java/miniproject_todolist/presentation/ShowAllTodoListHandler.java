package base_java.miniproject_todolist.presentation;

import java.text.SimpleDateFormat;
import java.util.*;
import base_java.miniproject_todolist.service.*;

public class ShowAllTodoListHandler {
    private TodoService todoService;

    public ShowAllTodoListHandler(TodoService todoService) {
        this.todoService = todoService;
    }

    public void handle() {
        System.out.println("===== 전체 할 일 목록 =====");
        todoService.getAllTodos().forEach((item) -> {
            System.out.print(item.getId() + " : ");
            System.out.println(item.getTitle());
            System.out.println(item.getDescription());

            Date startDate = item.getStartDate();
            Date endDate = item.getEndDate();

            if (startDate != null && endDate != null) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
                System.out.println(dateFormat.format(startDate) + " ~ " + dateFormat.format(endDate));
            }
        });
    }
}
