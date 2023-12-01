package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] move = new int[n];
        for (int i = 0; i < n; i++) {
            move[i] = Integer.parseInt(st.nextToken());
            dq.addLast(i + 1);
        }

        while (dq.size() > 1) {
            int idx = dq.pollFirst();
            int number = move[idx - 1];

            if (number < 0) {
                for (int i = number; i < 0; i++) {
                    int tmp = dq.pollLast();
                    dq.addFirst(tmp);
                }
            } else {
                for (int i = 0; i < number - 1; i++) {
                    int tmp = dq.pollFirst();
                    dq.addLast(tmp);
                }
            }
            sb.append(idx).append(" ");
        }

        sb.append(dq.pollFirst());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
