package baekjoon.combinatorics;

import java.io.*;

public class Baekjoon10872 {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(factorial(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}
