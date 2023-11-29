package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        int now = 1;
        Stack<Integer> stack = new Stack<>();

        while (idx != n) {
            if (number[idx] == now) {
                now++;
                idx++;
            } else if (!stack.isEmpty() && stack.peek() == now) {
                stack.pop();
                now++;
            } else {
                stack.push(number[idx++]);
            }
        }
        while (!stack.isEmpty()) {
            if (now == stack.peek()) {
                stack.pop();
                now++;
            } else {
                break;
            }
        }
        if (stack.isEmpty()) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
