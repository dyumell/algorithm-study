package boj.새싹.반복;

import java.io.*;

public class BOJ2741 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= input; i++){
            bw.write(i + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
