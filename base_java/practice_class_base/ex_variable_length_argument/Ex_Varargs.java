package base_java.practice_class_base.ex_variable_length_argument;

public class Ex_Varargs {
    public static void helloEverybody(String... vargs) {
        for (String s : vargs) {
            System.out.print(s + '\t');
        }
        System.out.println();
    }

    public static void main(String[] args) {
        helloEverybody("홍길동");
        helloEverybody("홍길동", "전우치");
        helloEverybody("홍길동", "전우치", "손오공");
    }
}
