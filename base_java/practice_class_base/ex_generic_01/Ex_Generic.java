package base_java.practice_class_base.ex_generic_01;

public class Ex_Generic {
    public static void main(String[] args) {
        Camp7<String, Integer> camp = new Camp7<>();
        camp.set("Apple", 25);
        System.out.println(camp);
    }
}
