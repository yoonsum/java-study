package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            char prev = str.charAt(0);
            String groupWord = "" + prev;

            for (int j = 1; j < str.length(); j++) {
                char now = str.charAt(j);
                // 지금 문자가 이전 문자와 다름
                if (prev != now) {
                    // 지금 문자가 그룹 문자에 포함되어있지 않음
                    if (groupWord.indexOf(now) == -1) {
                        groupWord += now;
                    } else {// 포함
                        cnt++;
                        break;
                    }
                }
                prev = now;
            }
        }

        bw.write(Integer.toString(n - cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
