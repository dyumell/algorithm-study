package boj.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for (int i =0; i < n; i++) {
            str[i] = br.readLine();
        }

        for (int i =0; i< n; i++) {
            System.out.println(String.valueOf(str[i].charAt(0)) + String.valueOf(str[i].charAt(str[i].length()-1)));
        }
    }
}
