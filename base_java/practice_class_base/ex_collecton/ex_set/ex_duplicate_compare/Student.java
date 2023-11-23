package base_java.practice_class_base.ex_collecton.ex_set.ex_duplicate_compare;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }

    // public int hashCode() {
    // int num = age % 3;
    // System.out.println(num);
    // return num;
    // }

    public int hashCode() {
        int num = java.util.Objects.hash(name, age);
        System.out.println(num);
        return num;
    }

    public boolean equals(Object obj) {
        System.out.println("비교를 합니다.");
        if (age == ((Student) obj).age) {
            return true;
        } else {
            return false;
        }
    }
}
