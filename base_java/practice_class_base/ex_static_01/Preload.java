package base_java.practice_class_base.ex_static_01;

import java.util.Random;

public class Preload {
    static int num;

    static {
        Random rand = new Random();
        num = rand.nextInt(100);// 0~99
    }

    public static void main(String[] args) {
        System.out.println(num);
    }
}
