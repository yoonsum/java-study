package baekjoon.sets_and_maps;

import java.io.*;
import java.util.*;

public class Baekjoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Set<String> member = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String isEnter = st.nextToken();
            if (isEnter.equals("enter")) {
                member.add(name);
            } else {
                member.remove(name);
            }
        }

        for (String m : member) {
            bw.write(new StringBuilder(m).append("\n").toString());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
