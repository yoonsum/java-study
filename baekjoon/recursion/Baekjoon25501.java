package baekjoon.recursion;

import java.io.*;

public class Baekjoon25501 {
    public static int cnt = 0;

    public static int recursion(String s, int l, int r) {
        cnt++;
        if (l >= r)
            return 1;
        else if (s.charAt(l) != s.charAt(r))
            return 0;
        else
            return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            sb.append(isPalindrome(str)).append(" ").append(cnt).append("\n");
            cnt = 0;
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
