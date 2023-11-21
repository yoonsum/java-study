package baekjoon.sort;

import java.io.*;

public class Baekjoon1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        char[] a = n.toCharArray();
        int len = n.length();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] < a[j]) {
                    char tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
        br.close();
    }
}
