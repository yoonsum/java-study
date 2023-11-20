package base_java.practice_class_base.ex_annotation_02;

public class Human5 implements Unit5 {
    @Override
    public void move(String str) {
        System.out.println(str);
    }

    @Override
    public void run(String str) {
        System.out.println(str);
    }
}
