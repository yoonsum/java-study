package base_java.practice_class_base.ex_inheritance_02;

public class MyTerran {
    public static void main(String[] args) {
        Marine unit1 = new Marine();
        unit1.name = "마린";
        unit1.hp = 100;
        unit1.attack = 20;

        Medic unit2 = new Medic();
        unit2.name = "메딕";
        unit2.hp = 120;
        unit2.heal = 10;

        unit1.doMove();
        System.out.println();
        unit2.doMove();
    }
}