package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double sum = 0.0;
        double scoreSum = 0.0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String subjectName = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String rating = st.nextToken();

            if (rating.compareTo("A+") == 0) {
                scoreSum += score;
                sum += (score * 4.5);
            } else if (rating.compareTo("A0") == 0) {
                scoreSum += score;
                sum += (score * 4.0);
            } else if (rating.compareTo("B+") == 0) {
                scoreSum += score;
                sum += (score * 3.5);
            } else if (rating.compareTo("B0") == 0) {
                scoreSum += score;
                sum += (score * 3.0);
            } else if (rating.compareTo("C+") == 0) {
                scoreSum += score;
                sum += (score * 2.5);
            } else if (rating.compareTo("C0") == 0) {
                scoreSum += score;
                sum += (score * 2.0);
            } else if (rating.compareTo("D+") == 0) {
                scoreSum += score;
                sum += (score * 1.5);
            } else if (rating.compareTo("D0") == 0) {
                scoreSum += score;
                sum += (score * 1.0);
            } else if (rating.compareTo("F") == 0) {
                scoreSum += score;
            }
        }
        bw.write(Double.toString(sum / scoreSum));

        bw.flush();
        bw.close();
        br.close();
    }
}
