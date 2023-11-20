package base_java.practice_class_base.ex_exception_01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_Exception_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num1 = sc.nextInt();
            int num2 = 10 / num1;
            System.out.println(num2);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("Good bye~~!");
        }
    }
}