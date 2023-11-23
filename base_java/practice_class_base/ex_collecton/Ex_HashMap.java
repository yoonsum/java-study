package base_java.practice_class_base.ex_collecton;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 저장
        map.put("홍길동", 20);
        map.put("전우치", 25);
        map.put("손오공", 27);

        // Key만 따로 모아놓은 set
        Set<String> ks = map.keySet();

        // key 출력
        for (String s : ks) {
            System.out.print(s + "\t");
        }
        System.out.println();

        // value 출력 - 향상된 for
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
