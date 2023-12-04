package baekjoon.advanced2;

import java.io.*;
import java.util.*;

public class Baekjoon20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> hm = new HashMap<>();
        Map<String, Integer> tm = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (Integer.compare(hm.get(a), hm.get(b)) != 0) {
                    return Integer.compare(hm.get(b), hm.get(a));
                }
                if (a.length() != b.length()) {
                    return b.length() - a.length();
                }
                return a.compareTo(b);
            }
        });

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.length() >= m) {
                if (hm.containsKey(str)) {
                    hm.put(str, hm.get(str) + 1);
                } else {
                    hm.put(str, 1);
                }
            }
        }

        tm.putAll(hm);

        StringBuilder sb = new StringBuilder();
        Set<String> ks = tm.keySet();
        for (Iterator<String> itr = ks.iterator(); itr.hasNext();) {
            sb.append(itr.next()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
