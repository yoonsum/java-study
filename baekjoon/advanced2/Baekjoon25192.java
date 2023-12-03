package baekjoon.advanced2;

import java.io.*;
import java.util.*;

public class Baekjoon25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> s = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.equals("ENTER")) {
                cnt += s.size();
                s.clear();
            } else {
                s.add(str);
            }
        }

        cnt += s.size();

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
