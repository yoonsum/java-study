package base_java.practice_class_base.ex_collecton.ex_treeset_sort;

import java.util.Set;
import java.util.TreeSet;

public class Ex_Comparable {
    public static void main(String[] args) {
        Set<Student> tree = new TreeSet<>();
        tree.add(new Student("홍길동", 30));
        tree.add(new Student("전우치", 40));
        tree.add(new Student("손오공", 20));

        for (Student s : tree) {
            System.out.println(s);
        }
    }
}
