package base_java.miniproject_todolist.presentation;

import java.util.*;

import base_java.miniproject_todolist.service.TodoService;

public class Menu {
    private TodoService todoService;
    private Scanner sc;

    public Menu(TodoService todoService) {
        this.todoService = todoService;
        this.sc = new Scanner(System.in);
    }

    /**
     * 입력받은 메뉴 데이터 유효성 검증
     * 
     * @param input
     * @return
     */
    private boolean checkMenu(String input) {
        if (input.length() > 1) {
            return false;
        }

        if ('0' >= input.charAt(0) && input.charAt(0) >= '9') {
            return false;
        }

        return true;
    }

    /**
     * 메뉴 목록 보기 및 메뉴 입력 받기
     */
    public void displayMenu() {
        System.out.println("===== To Do List Application Menu =====");
        System.out.println("1. 전체 할 일 목록 보기");
        System.out.println("2. 할 일 추가하기");
        System.out.println("3. 할 일 수정하기");
        System.out.println("4. 할 일 삭제하기");
        System.out.println("5. 할 일 완료하기");
        System.out.println("6. 날짜별로 정렬해서 목록 보기");
        System.out.println("7. 할 일 정렬해서 목록 보기");
        System.out.println("0. 종료");
        System.out.println("=======================================");

        String input = sc.nextLine();
        int selectedMenu;

        if (!checkMenu(input)) {
            System.out.println("입력값이 잘못되었습니다. 메뉴룰 다시 입력해주세요");
            return;
        }

        selectedMenu = input.charAt(0) - '0';

        switch (selectedMenu) {
            case 0:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("입력값이 잘못되었습니다. 메뉴를 다시 입력해주세요.");
                break;
        }
    }
}
