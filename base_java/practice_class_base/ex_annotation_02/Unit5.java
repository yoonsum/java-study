package base_java.practice_class_base.ex_annotation_02;

public interface Unit5 {
    // 문제 발생 소지가 있거나 개선된 기능의 다른것으로 대체되어 더 이상 필요 없게 되었음
    // 호환성 유지를 위해 존재하지만 이후에 사라질 수 있는 클래스 또는 메소드
    @Deprecated
    public void move(String str);

    public void run(String str);
}
