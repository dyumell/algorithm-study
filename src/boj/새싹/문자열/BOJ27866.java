package boj.새싹.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ27866 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();
        int inputIndex = Integer.parseInt(br.readLine());

        System.out.println(inputStr.charAt(inputIndex-1));
    }
}
