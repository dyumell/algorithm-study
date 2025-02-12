package boj.조건문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ9498 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input =Integer.parseInt(br.readLine());

        if (input >= 90 && input <= 100){
            bw.write("A");
        } else if (input >= 80 && input < 90) {
            bw.write("B");
        } else if (input >= 70 && input < 80) {
            bw.write("C");
        } else if (input >= 60 && input < 70) {
            bw.write("D");
        } else {
            bw.write("F");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
