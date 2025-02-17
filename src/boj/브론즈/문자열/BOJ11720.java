package boj.브론즈.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] number = new int[n];

        String str = br.readLine();

        for (int i =0; i< n; i ++) {
            number[i] = (int)(str.charAt(i)-48);
        }
        int sum = 0;
        for (int i =0; i< n;i++) {
            sum += number[i];
        }

        System.out.println(sum);
    }
}
