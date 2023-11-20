package base_java.practice_class_base.ex_annotation_03;

public class Ex_SuppressWarnings {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Unit6 unit = new Human6();
        unit.move("인간형 유닛이 이동합니다.");
        unit.run("인간형 유닛이 달립니다.");
    }
}
