package baekjoon.one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] student = new boolean[30];

        for (int i = 0; i < 28; i++) {
            int no = Integer.parseInt(br.readLine());
            student[no - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!student[i]) {
                bw.write(Integer.toString(i + 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
