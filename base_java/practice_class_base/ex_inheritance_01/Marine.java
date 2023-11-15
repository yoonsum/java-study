package base_java.practice_class_base.ex_inheritance_01;

public class Marine extends Unit {
    int attack;

    void printMarine() {
        printUnit();
        System.out.println("공격력 : " + attack);
    }
}
