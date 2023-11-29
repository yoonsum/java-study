package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.contains("push")) {
                st = new StringTokenizer(input);
                st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                q.add(num);
            } else if (input.contains("pop")) {
                if (q.peek() != null) {
                    sb.append(q.poll()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            } else if (input.contains("size")) {
                sb.append(q.size()).append("\n");
            } else if (input.contains("empty")) {
                if (q.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (input.contains("front")) {
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(q.peek()).append("\n");
                }
            } else if (input.contains("back")) {
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(q.peekLast()).append("\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
