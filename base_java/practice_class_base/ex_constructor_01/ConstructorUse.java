package base_java.practice_class_base.ex_constructor_01;

public class ConstructorUse {
    public static void main(String[] args) {
        Book javaBook = new Book();
        javaBook.print();

        // 오버로딩된 생성자 사용
        Book springBook = new Book("스프링 프레임워크", 50000);
        springBook.count = 3;
        springBook.print();
    }
}
