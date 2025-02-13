package boj;

import java.io.*;

public class BOJ11654 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String inputStr = br.readLine();
        if (inputStr != null && !inputStr.isEmpty()) {
            char input = inputStr.charAt(0);
            System.out.println((int)input);
        }
    }
}
