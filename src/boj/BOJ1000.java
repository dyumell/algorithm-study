package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1000 {
    public static void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs= br.readLine().split(" ");

        int sum = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]);

        bw.write(String.valueOf(sum));
        bw.flush();

        bw.close();
        br.close();

    }
}
