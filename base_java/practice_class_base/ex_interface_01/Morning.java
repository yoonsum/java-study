package base_java.practice_class_base.ex_interface_01;

public class Morning implements Greet, Talk { // 인터페이스 구현
    public void greet() {
        System.out.println("안녕하세요.");
    }

    public void talk() {
        System.out.println("날씨 좋네요.");
    }
}
