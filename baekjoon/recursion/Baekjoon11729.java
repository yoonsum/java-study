package baekjoon.recursion;

import java.io.*;

public class Baekjoon11729 {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    static void recursion(int num, int from, int tmp, int to) {
        count++;
        if (num == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }

        // 1 -> 2
        recursion(num - 1, from, to, tmp);
        // 1 -> 3
        sb.append(from).append(" ").append(to).append("\n");
        // 2 -> 3
        recursion(num - 1, tmp, from, to);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        recursion(n, 1, 2, 3);

        bw.write(Integer.toString(count) + "\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
