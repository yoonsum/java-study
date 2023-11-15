package base_java.practice_class_base.ex_inheritance_02;

public class Marine extends Unit {
    int attack;

    void doMove() { // 오버라이딩
        super.doMove(); // 부모 호출
        System.out.println(attack + "공격"); // 기능 추가
    }
}
