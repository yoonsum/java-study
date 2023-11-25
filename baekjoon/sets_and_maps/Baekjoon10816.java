package baekjoon.sets_and_maps;

import java.io.*;
import java.util.*;

public class Baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Map<String, Integer> numCard = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            String num = st.nextToken();
            if (numCard.containsKey(num)) {
                numCard.put(num, numCard.get(num) + 1);
            } else {
                numCard.put(num, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String card = st.nextToken();
            Integer value = numCard.get(card);
            if (value == null) {
                sb.append("0").append(" ");
            } else {
                sb.append(Integer.toString(value)).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
