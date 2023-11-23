package baekjoon.sets_and_maps;

import java.io.*;
import java.util.*;

public class Baekjoon14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> str = new TreeSet<String>();
        for (int i = 0; i < n; i++) {
            str.add(br.readLine());
        }

        String[] arr = new String[m];
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            arr[i] = br.readLine();

            if (str.contains(arr[i])) {
                cnt++;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
