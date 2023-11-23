package base_java.practice_class_base.ex_collecton.ex_treeset_sort;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }

    public int compareTo(Student p) {
        // return this.age - p.age;// 오름차순
        return p.age - this.age; // 내림차순
        // return this.name.compareTo(p.name); // 오름차순
        // return p.name.comepareTo(this.name); // 내림차순
    }
}
