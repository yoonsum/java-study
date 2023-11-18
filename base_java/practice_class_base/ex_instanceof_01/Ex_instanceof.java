package base_java.practice_class_base.ex_instanceof_01;

public class Ex_instanceof {
    public static void main(String[] args) {
        // Cry test1 = new Cat();
        Cry test1 = new Dog();

        if (test1 instanceof Cat) {
            test1.cry();
        } else if (test1 instanceof Dog) {
            System.out.println("고양이가 아닙니다.");
        }
    }
}
