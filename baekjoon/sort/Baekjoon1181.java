package baekjoon.sort;

import java.io.*;
import java.util.*;

public class Baekjoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        HashSet<String> hs = new HashSet<>(Arrays.asList(arr));

        arr = hs.toArray(new String[0]);

        Arrays.sort(arr, (a1, a2) -> {
            if (a1.length() > a2.length()) {
                return 1;
            } else if (a1.length() < a2.length()) {
                return -1;
            } else {
                for (int i = 0; i < a1.length(); i++) {
                    if (a1.charAt(i) > a2.charAt(i)) {
                        return 1;
                    } else if (a1.charAt(i) < a2.charAt(i)) {
                        return -1;
                    }
                }
            }
            return 0;
        });

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
