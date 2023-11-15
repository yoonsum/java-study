package base_java.practice_class_base.ex_static_01;

public class UtilMethod {
    public static void main(String[] args) {
        MyCalculator calc1 = new MyCalculator();// static 성격상 프로그램 실행전에 이미 스태틱 영역에 로드되어 있음, 낭비
        int num1 = calc1.adder(1, 2);
        System.out.println(num1);

        int num2 = MyCalculator.adder(2, 3);
        System.out.println(num2);

    }
}
