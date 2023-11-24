package baekjoon.sets_and_maps;

import java.io.*;
import java.util.*;

public class Baekjoon1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> poketmon1 = new HashMap<>();
        Map<String, Integer> poketmon2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            poketmon1.put(i + 1, name);
            poketmon2.put(name, i + 1);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if ('0' <= input.charAt(0) && input.charAt(0) <= '9') {
                sb.append(poketmon1.get(Integer.parseInt(input))).append("\n");
            } else {
                sb.append(poketmon2.get(input)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
