package boj;

import java.io.*;

public class BOJ1008 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        double sum = Double.parseDouble(inputs[0]) / Double.parseDouble(inputs[1]);
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}