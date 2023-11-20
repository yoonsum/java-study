package base_java.practice_class_base.ex_annotation_03;

public class Human6 implements Unit6 {
    // deprecation 관련 경고 등 특정 메시지를 지정하면 해당 경고 메시지를 출력하지 말라는 의미
    @Override
    @SuppressWarnings("deprecation")
    public void move(String str) {
        System.out.println(str);
    }

    @Override
    public void run(String str) {
        System.out.println(str);
    }
}