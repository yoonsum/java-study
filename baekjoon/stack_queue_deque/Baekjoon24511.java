package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st, st1;

        Deque<Integer> q = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == 0) {
                q.addLast(Integer.parseInt(st1.nextToken()));
            } else {
                st1.nextToken();
            }
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(st.nextToken());

            q.addFirst(number);
            sb.append(q.pollLast()).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}