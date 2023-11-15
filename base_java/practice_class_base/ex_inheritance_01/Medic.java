package base_java.practice_class_base.ex_inheritance_01;

public class Medic extends Unit {
    int heal;

    void printMedic() {
        printUnit();
        System.out.println("치유량 : " + heal);
    }
}
