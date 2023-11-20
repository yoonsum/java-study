package base_java.practice_class_base.ex_enum_01;

public class Ex_Enum {
    public static void main(String[] args) {
        createUnit(Machine2.TANK);
    }

    public static void createUnit(Machine2 kind) {
        switch (kind) {
            case TANK:
                System.out.println("탱크를 만듭니다.");
                break;
            case AIRPLNAE:
                System.out.println("비행기를 만듭니다.");
                break;
        }
    }
}
