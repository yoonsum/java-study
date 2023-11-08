package baekjoon.one_dimensional_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];

        int max = arr[0] = Integer.parseInt(br.readLine());
        int maxidx = 1;
        for (int i = 1; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (max < arr[i]) {
                max = arr[i];
                maxidx = i + 1;
            }
        }
        bw.write(max + "\n");
        bw.write(maxidx + "\n");

        bw.flush();
        bw.close();
        bw.close();
    }
}
