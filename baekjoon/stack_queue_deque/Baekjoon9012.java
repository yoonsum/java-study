package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            Stack<Character> s = new Stack<>();

            s.push(str.charAt(0));
            for (int j = 1; j < str.length(); j++) {
                if (s.isEmpty()) {
                    s.push(str.charAt(j));
                } else if (s.lastElement() == '(' && str.charAt(j) == ')') {
                    s.pop();
                } else {
                    s.push(str.charAt(j));
                }
            }
            if (s.isEmpty()) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
