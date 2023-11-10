package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        boolean isIt = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isIt = false;
                break;
            }
        }

        if (isIt) {
            bw.write(Integer.toString(1));
        } else {
            bw.write(Integer.toString(0));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
