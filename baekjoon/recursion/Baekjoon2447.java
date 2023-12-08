package baekjoon.recursion;

import java.io.*;

public class Baekjoon2447 {
    public static char[][] recursion(char[][] base) {
        System.out.println(base.length); // 3
        int len = base.length;

        char[][] pattern = new char[len][len];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }

        if(){
            recursion(pattern);
        }
        return pattern;
    }

    // 짜파게티
    // 인성탕면2개
    // 밀가루?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n];
        char[][] base = {
                { '*', '*', '*' },
                { '*', ' ', '*' },
                { '*', '*', '*' } };

        char[][] pattern = recursion(base);

    }
}
