package base_java.practice_class_base.ex_static_01;

public class Cat {
    static int a = 5;
    int num = 3;

    void printValue(int num) {
        this.num = num;
        System.out.println("num : " + this.num);
        System.out.println("a : " + a);
    }
}
