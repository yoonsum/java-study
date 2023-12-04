package baekjoon.recursion;

import java.io.*;

public class Baekjoon27433 {
    public static long factorial(int a) {
        if (a <= 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(Long.toString(factorial(n)));
        bw.flush();
        bw.close();
        br.close();
    }
}
