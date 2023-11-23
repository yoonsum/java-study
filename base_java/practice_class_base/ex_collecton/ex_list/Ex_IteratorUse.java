package base_java.practice_class_base.ex_collecton.ex_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex_IteratorUse {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Orange");
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");

        for (String s : list)
            System.out.print(s + "\t");
        System.out.println();

        // 반복자 획득
        Iterator<String> itr = list.iterator();

        String str;
        while (itr.hasNext()) {// 반복할 수 있는지
            str = itr.next(); // 항목 가져오기
            System.out.print(str + "\t");

            if (str.equals("Orange")) {
                itr.remove();// 삭제
            }
        }
        System.out.println();

        // 반복자 획득
        itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
    }
}