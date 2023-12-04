package baekjoon.recursion;

import java.io.*;

public class Baekjoon10870 {
    public static int fibonacci(int a) {
        if (a < 2) {
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(fibonacci(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}
