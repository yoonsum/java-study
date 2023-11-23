package base_java.practice_class_base.ex_collecton.ex_set.ex_duplicate_compare;

import java.util.HashSet;

public class Ex_HashSetEqual {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        // equal에서 age를 비교하기 떄문에 20은 중복된 데이터로 판단 -> HashSet에 추가되지 않음
        // java에서 제공한 메소드를 이용해서 해시를 구하면 추가한 데이터의 모든 해시값이 다르기 때문에 equals가 호출되지 않음
        set.add(new Student("홍길동", 20));
        set.add(new Student("전우치", 20));
        set.add(new Student("홍길동", 25));

        System.out.println("객체 수 : " + set.size());

        for (Student s : set) {
            System.out.print(s.toString() + "\t");
        }
        System.out.println();
    }
}
