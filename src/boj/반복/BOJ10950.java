package boj.반복;

import java.io.*;

public class BOJ10950 {
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        while (input > 0) {
            String[] inputs = br.readLine().split(" ");
            int sum = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]);

            bw.write(sum + "\n");

            input--;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
