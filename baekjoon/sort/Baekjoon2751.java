package baekjoon.sort;

import java.io.*;
import java.util.*;

public class Baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(a);

        for (int i = 0; i < n; i++) {
            bw.write(Integer.toString(a.get(i)) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
