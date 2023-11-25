package baekjoon.sets_and_maps;

import java.io.*;
import java.util.*;

public class Baekjoon1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<String> noListen = new TreeSet<>();
        Set<String> noSee = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            noListen.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            noSee.add(br.readLine());
        }

        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (Iterator<String> itr = noListen.iterator(); itr.hasNext();) {
            String name = itr.next().toString();
            if (noSee.contains(name)) {
                cnt++;
                sb.append(name).append("\n");
            }
        }

        bw.write(Integer.toString(cnt) + "\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
