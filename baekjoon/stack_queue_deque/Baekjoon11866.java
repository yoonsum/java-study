package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.addLast(i + 1);
        }

        while (true) {
            for (int i = 0; i < k - 1; i++) {
                int tmp = q.pollFirst();
                q.addLast(tmp);
            }

            sb.append(q.pollFirst());

            if (!q.isEmpty()) {
                sb.append(", ");
            } else {
                sb.append(">");
                break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}