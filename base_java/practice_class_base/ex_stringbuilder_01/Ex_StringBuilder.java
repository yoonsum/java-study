package base_java.practice_class_base.ex_stringbuilder_01;

public class Ex_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("동해물과");

        sb.append("백두산이"); // 문자열 합치기
        System.out.println(sb.toString()); // String으로 변환후 출력

        sb.append(12345);
        System.out.println(sb.toString());

        sb.delete(0, 4);
        System.out.println(sb.toString());

        sb.replace(4, 8, "ABC");
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());
    }
}