package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Stack<Integer> s = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            int num = input.charAt(0) - '0';

            if (num == 1) {
                st = new StringTokenizer(input);
                st.nextToken();
                s.push(Integer.parseInt(st.nextToken()));
            } else if (num == 2) {
                if (s.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(s.pop()).append("\n");
                }
            } else if (num == 3) {
                sb.append(s.size()).append("\n");
            } else if (num == 4) {
                if (s.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (num == 5) {
                if (s.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(s.lastElement()).append("\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
