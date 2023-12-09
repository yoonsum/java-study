package base_java.miniproject_todolist.presentation;

import base_java.miniproject_todolist.domain.TodoItem;
import base_java.miniproject_todolist.service.TodoService;

import java.text.SimpleDateFormat;
import java.util.*;

public class AddTodoHandler {
    private TodoService todoService;
    private Scanner sc;

    public AddTodoHandler(TodoService todoService, Scanner sc) {
        this.todoService = todoService;
        this.sc = sc;
    }

    private boolean checkStartEndDate(String start, String end) {
        return start.matches("^\\d{4}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])$");
    }

    private boolean checkDateYN(String ans) {
        if (ans.charAt(0) == 'Y' || ans.charAt(0) == 'N') {
            return true;
        }
        return false;
    }

    public void handle() {
        System.out.println("===== 새로운 할 일을 추가합니다. =====");

        System.out.print("할 일 : ");
        String title = sc.nextLine();

        System.out.print("설명 : ");
        String description = sc.nextLine();

        System.out.print("날짜를 설정할까요?(Y or N) : ");
        String isDate;
        while (true) {
            isDate = sc.nextLine();

            if (!checkDateYN(isDate)) {
                System.out.print("Y or N 으로 입력해주세요. : ");
            } else {
                break;
            }
        }

        TodoItem todo = new TodoItem();
        todo.setTitle(title);
        todo.setDescription(description);

        if (isDate.charAt(0) == 'Y') {
            System.out.print("시작 날짜(20230101): ");
            String startDate = sc.nextLine();
            System.out.print("종료 날짜(20230101): ");
            String endDate = sc.nextLine();

            if (checkStartEndDate(startDate, endDate)) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
                try {
                    todo.setStartDate(dateFormat.parse(startDate));
                    todo.setEndDate(dateFormat.parse(endDate));
                } catch (Exception e) {
                    System.out.println("시작날짜, 종료날짜를 저장할 수 없습니다.");
                }
            } else {
                System.out.println("날짜 형식이 맞지 않습니다.");
            }
        } else {
            todo.setStartDate(null);
            todo.setEndDate(null);
        }

        todoService.addTodo(todo);

        System.out.println("새로운 할 일이 추가되었습니다.");
    }
}
