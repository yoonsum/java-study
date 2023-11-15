package base_java.practice_class_base.ex_abstract_01;

public class MyStarcraft {
    public static void main(String[] args) {
        Marine unit1 = new Marine();
        unit1.doMove();

        Zergling unit2 = new Zergling();
        unit2.doMove();
    }
}
