package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dq = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.charAt(0) == '1') {
                st = new StringTokenizer(str);
                st.nextToken();
                dq.addFirst(Integer.parseInt(st.nextToken()));
            } else if (str.charAt(0) == '2') {
                st = new StringTokenizer(str);
                st.nextToken();
                dq.addLast(Integer.parseInt(st.nextToken()));
            } else if (str.charAt(0) == '3') {
                if (!dq.isEmpty()) {
                    sb.append(dq.pollFirst()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            } else if (str.charAt(0) == '4') {
                if (!dq.isEmpty()) {
                    sb.append(dq.pollLast()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            } else if (str.charAt(0) == '5') {
                sb.append(dq.size()).append("\n");
            } else if (str.charAt(0) == '6') {
                if (dq.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (str.charAt(0) == '7') {
                if (!dq.isEmpty()) {
                    sb.append(dq.peekFirst()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            } else if (str.charAt(0) == '8') {
                if (!dq.isEmpty()) {
                    sb.append(dq.peekLast()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}