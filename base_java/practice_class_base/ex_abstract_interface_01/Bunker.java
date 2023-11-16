package base_java.practice_class_base.ex_abstract_interface_01;

public class Bunker extends Building {
    void doBuild() {// 상속, 추상메소드
        System.out.println("인간형 유닛이 숨을 건물을 짓습니다.");
    }

    void doDefense() {// 추가기능
        System.out.println("숨은 유닛을 적의 공격으로부터 보호합니다.");
    }
}
