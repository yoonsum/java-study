package base_java.practice_class_base.ex_instanceof_02;

public class Ex_instanceof {
    public static void animalChoose(Animal obj) {
        if (obj instanceof Tiger) {
            Tiger tiger = (Tiger) obj;
            tiger.doMove();
        } else {
            Lion lion = (Lion) obj;
            lion.doMove();
        }
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        animalChoose(tiger);

        Lion lion = new Lion();
        animalChoose(lion);
    }
}
