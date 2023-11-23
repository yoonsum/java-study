package base_java.practice_class_base.ex_collecton.ex_list;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Ex_ConvertList {
    public static void main(String[] args) {
        // 초기값을 가진 리스트 생성, 요소를 추가하거나 삭제할 수 없음
        List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "전우치");
        // 수정할 수 있는 객체로 변환 - ArrayList
        list = new ArrayList<>(list);
        list.add("해리포터");

        for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

        // 수정할 수 있는 객체로 변환 - LinkedList
        list = new LinkedList<>(list);

        for (String s : list) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
