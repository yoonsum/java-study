package baekjoon.sets_and_maps;

import java.io.*;
import java.util.*;

public class Baekjoon1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int aNum = Integer.parseInt(st.nextToken());
        int bNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < aNum; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < bNum; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (aSet.contains(num)) {
                aSet.remove(num);
            } else {
                bSet.add(num);
            }
        }

        bw.write(Integer.toString(aSet.size() + bSet.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}
