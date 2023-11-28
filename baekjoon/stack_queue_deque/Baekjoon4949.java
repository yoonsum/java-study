package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder str_sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        while (true) {
            str_sb.append(br.readLine());

            if (str_sb.toString().charAt(str_sb.toString().length() - 1) == '.') {
                if (str_sb.toString().equals(".")) {
                    break;
                } else {
                    String str = str_sb.toString();
                    StringTokenizer st = new StringTokenizer(str);
                    Stack<Character> stack = new Stack<>();

                    while (st.hasMoreTokens()) {
                        String s = st.nextToken();
                        if (s.contains("(") || s.contains(")") || s.contains("[") || s.contains("]")) {
                            for (int i = 0; i < s.length(); i++) {
                                if (s.charAt(i) == '(') {
                                    stack.push('(');
                                } else if (s.charAt(i) == ')') {
                                    if (stack.isEmpty()) {
                                        stack.push(')');
                                    } else if (stack.lastElement() == '(') {
                                        stack.pop();
                                    } else {
                                        stack.push(')');
                                    }
                                } else if (s.charAt(i) == '[') {
                                    stack.push('[');
                                } else if (s.charAt(i) == ']') {
                                    if (stack.isEmpty()) {
                                        stack.push(')');
                                    } else if (stack.lastElement() == '[') {
                                        stack.pop();
                                    } else {
                                        stack.push(']');
                                    }
                                }
                            }
                        }
                    }

                    if (stack.isEmpty()) {
                        sb.append("yes\n");
                    } else {
                        sb.append("no\n");
                    }
                }
                str_sb.setLength(0);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
