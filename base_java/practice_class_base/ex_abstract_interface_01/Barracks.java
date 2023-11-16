package base_java.practice_class_base.ex_abstract_interface_01;

public class Barracks extends Building implements Fly {
    void doBuild() { // 상속, 추상메소드
        System.out.println("인간형 유닛 생산 건물을 짓습니다.");
    }

    void doMakeMarine() {// 추가기능
        System.out.println("총쏘는 유닛을 생산합니다.");
    }

    public void flyBuilding() {// 인터페이스로 Fly 기능 추가
        System.out.println("건물이 날아서 이동하게 합니다.");
    }
}
