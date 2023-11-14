package base_java.practice_class_base.ex_constructor_01;

public class Book {
    String title;
    int price;
    int count = 0;

    // 디폴트 생성자에 기능부여
    Book() {
        title = "자바 프로그래밍";
        price = 30000;
    }

    // 생성자 오버로딩
    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void print() {
        System.out.println("제목 : " + title);
        System.out.println("가격 : " + price);
        System.out.println("주문수량 : " + count);
        System.out.println("합계금액 : " + (price * count));
    }
}
