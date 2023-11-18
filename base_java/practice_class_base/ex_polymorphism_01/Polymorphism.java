package base_java.practice_class_base.ex_polymorphism_01;

public class Polymorphism {
    public static Human humanCreate(int kind) {
        if (kind == 1) {
            // Human m = new Man();
            // return m;
            return new Man();
        } else {
            return new Woman();
        }
    }

    public static void main(String[] args) {
        // 상속받은 클래스의 객체는 슈퍼 클래스로도 서브 클래스로도 다룰수 있다
        Human h1 = humanCreate(1); // 클래스 자동 형변환
        h1.print();

        Human h2 = humanCreate(2);
        h2.print();
    }
}
