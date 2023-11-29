package baekjoon.stack_queue_deque;

import java.io.*;
import java.util.*;

public class Baekjoon2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        int idx = 1;
        while (q.size() != 1) {
            if (idx % 2 == 0) {
                int tmp = q.pollFirst();
                q.addLast(tmp);
                idx++;
            } else {
                q.pollFirst();
                idx++;
            }
        }
        bw.write(Integer.toString(q.poll()));
        bw.flush();
        bw.close();
        br.close();
    }
}
