package base_java.practice_class_base.ex_overloading_01;

public class OverloadingUse {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int add_int_param2_result = calc.add(1, 2);
        int add_int_param1_result = calc.add(3);
        double add_double_param2_result = calc.add(4.5, 6.7);

        System.out.println("int 매개변수 2개 : " + add_int_param2_result);
        System.out.println("int 매개변수 1개 : " + add_int_param1_result);
        System.out.println("double 매개변수 2개 : " + add_double_param2_result);
    }
}