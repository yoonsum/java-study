package base_java.practice_class_base.ex_collecton;

import java.util.LinkedList;
import java.util.Queue;

public class Ex_Queue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();

        que.offer("A");
        que.offer("B");
        que.offer("C");
        System.out.println(que.size());

        System.out.println("next : " + que.peek());// 다음에 무엇이 나올지 확인
        System.out.println(que.poll());// 객체 꺼내기
        System.out.println(que.size());

        System.out.println("next : " + que.peek());// 다음에 무엇이 나올지 확인
        System.out.println(que.poll());// 객체 꺼내기
        System.out.println(que.size());

        System.out.println("next : " + que.peek());// 다음에 무엇이 나올지 확인
        System.out.println(que.poll());// 객체 꺼내기
        System.out.println(que.size());
    }
}
