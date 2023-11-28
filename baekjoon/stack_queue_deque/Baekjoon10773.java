package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> s = new Stack<>();
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                s.pop();
            } else {
                s.push(n);
            }
        }

        int sum = 0;
        int len = s.size();
        for (int i = 0; i < len; i++) {
            sum += s.pop();
        }

        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
