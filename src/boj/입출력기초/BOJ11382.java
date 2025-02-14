package boj.입출력기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11382 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");

        System.out.println(Long.parseLong(strs[0])+Long.parseLong(strs[1])+Long.parseLong(strs[2]));
    }
}
