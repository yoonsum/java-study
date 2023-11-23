package baekjoon.sets_and_maps;

import java.io.*;
import java.util.*;

public class Baekjoon10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> hs = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            hs.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (hs.contains(arr[i])) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
