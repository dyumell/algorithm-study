package boj.새싹.조건문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ14681 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputX = Integer.parseInt(br.readLine());
        int inputY = Integer.parseInt(br.readLine());

        if (inputX >= 0 && inputY >= 0) {
            bw.write("1");
        } else if (inputX < 0 && inputY >= 0) {
            bw.write("2");
        } else if (inputX < 0 && inputY < 0) {
            bw.write("3");
        } else {
            bw.write("4");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
