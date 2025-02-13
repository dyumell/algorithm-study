package boj;

import java.io.*;

public class BOJ15552 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());


        int[] sum = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            String[] inputs = br.readLine().split(" ");
            sum[i] = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]);
            bw.write(String.valueOf(sum[i])+ "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}