package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] croatiaAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        String str = br.readLine();

        for (int i = 0; i < croatiaAlphabet.length; i++) {
            int idx = str.indexOf(croatiaAlphabet[i]);
            if (idx >= 0) {
                str = str.replaceAll(croatiaAlphabet[i], "*");
            }
        }
        bw.write(Integer.toString(str.length()));
        bw.flush();
        bw.close();
        br.close();

    }
}
