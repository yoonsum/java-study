package baekjoon.advanced2;

import java.io.*;
import java.util.*;

public class Baekjoon26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> s = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.contains("ChongChong")) {
                StringTokenizer st = new StringTokenizer(str);
                s.add(st.nextToken());
                s.add(st.nextToken());
            } else if (s.size() > 1) {
                StringTokenizer st = new StringTokenizer(str);
                String str1 = st.nextToken();
                String str2 = st.nextToken();

                if (s.contains(str1)) {
                    s.add(str2);
                }
                if (s.contains(str2)) {
                    s.add(str1);
                }
            }
        }
        bw.write(Integer.toString(s.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}