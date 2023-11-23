package base_java.practice_class_base.ex_collecton.ex_list;

import java.util.LinkedList;
import java.util.List;

public class Ex_LinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Orange");
        list.add("apple");
        list.add("apple");
        list.add("banana");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        list.remove(0);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.err.println();
    }
}
