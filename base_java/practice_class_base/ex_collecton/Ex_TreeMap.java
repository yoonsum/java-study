package base_java.practice_class_base.ex_collecton;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Ex_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("홍길동", 20);
        map.put("전우치", 25);
        map.put("손오공", 27);

        Set<String> ks = map.keySet();

        // key 출력 - key만 set에 저장
        for (String s : ks) {
            System.out.print(s + "\t");
        }
        System.out.println();

        // value 출력 - 향상된 ofr
        for (String s : ks) {
            System.out.print(map.get(s).toString() + "\t");
        }
        System.out.println();

        // value 출력 - Iterator
        for (Iterator<String> itr = ks.iterator(); itr.hasNext();) {
            System.out.print(map.get(itr.next()).toString() + "\t");
        }
        System.out.println();
    }
}
