package base_java.practice_class_base.ex_collecton.ex_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex_HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Apple");
        set.add("Banana");

        System.out.println("객체 수 : " + set.size());

        for (Iterator<String> itr = set.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

        for (String s : set) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
