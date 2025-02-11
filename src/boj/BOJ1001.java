package boj;

import java.io.*;

public class BOJ1001 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int sum = Integer.parseInt(inputs[0]) - Integer.parseInt(inputs[1]);

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
