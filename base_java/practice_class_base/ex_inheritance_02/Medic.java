package base_java.practice_class_base.ex_inheritance_02;

public class Medic extends Unit {
    int heal;

    void doMove() { // doMove 메소드 오버라이딩 해서 자체구현
        System.out.println("이동속도 8으로 이동");
        System.out.println(heal + "치유");
    }
}
