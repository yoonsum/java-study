package base_java.practice_class_base.ex_generic_02;

public class Camp8<T extends Number> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}
