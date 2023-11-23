package base_java.practice_class_base.ex_collecton;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex_Stack {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();
        // Deque<String> deq = new LinkedList<>();

        // 스택
        // 앞에서 넣기
        deq.offerFirst("A");
        deq.offerFirst("B");
        deq.offerFirst("C");

        // 앞에서 데이터 꺼내기
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());

        System.out.println("------------------------");

        // 스택
        // 뒤에서 넣기
        deq.offerLast("A");
        deq.offerLast("B");
        deq.offerLast("C");

        // 뒤에서 꺼내기
        System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());
        System.out.println(deq.pollLast());

        System.out.println("------------------------");

        // 큐
        // 뒤에서 넣기
        deq.offerLast("A");
        deq.offerLast("B");
        deq.offerLast("C");

        // 앞에서 데이터 꺼내기
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());

    }
}
