package base_java.miniproject_todolist;

import base_java.miniproject_todolist.presentation.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        while (true) {
            menu.displayMenu();
        }
    }
}
