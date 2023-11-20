package base_java.practice_class_base.ex_exception_01;

import java.util.Scanner;

public class Ex_Exception_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num1 = sc.nextInt();
            int num2 = 10 / num1;
            System.out.println(num2);
        } catch (Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("Good bye~~!");
        }
    }
}