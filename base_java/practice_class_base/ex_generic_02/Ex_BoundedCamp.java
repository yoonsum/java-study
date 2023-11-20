package base_java.practice_class_base.ex_generic_02;

public class Ex_BoundedCamp {
    public static void main(String[] args) {
        Camp8<Integer> iBox = new Camp8<>();
        iBox.set(24);

        Camp8<Double> dBox = new Camp8<>();
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.err.println(dBox.get());
    }
}
