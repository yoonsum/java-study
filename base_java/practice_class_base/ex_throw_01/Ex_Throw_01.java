package base_java.practice_class_base.ex_throw_01;

import java.util.Scanner;

public class Ex_Throw_01 {
    public static void myMethod1() {
        try {
            myMethodA();
        } catch (Throwable e) {
            System.out.println("에러!!");
        }
    }

    public static void myMethod2() {
        try {
            myMethodA();
        } catch (Throwable e) {
            System.out.println("Error!!");
        }
    }

    public static void myMethodA() {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = 10 / num1;
        System.out.println(num2);
    }

    public static void main(String[] args) {
        myMethod1();
        myMethod2();
    }
}
