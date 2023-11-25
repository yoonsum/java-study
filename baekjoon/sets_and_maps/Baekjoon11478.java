package baekjoon.sets_and_maps;

import java.io.*;
import java.util.*;

public class Baekjoon11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Set<String> str = new HashSet<>();

        int len = 1;
        while (len <= s.length()) {
            int start = 0;
            while (start + len <= s.length()) {
                str.add(s.substring(start, start + len));
                start++;
            }
            len++;
        }

        bw.write(Integer.toString(str.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}
