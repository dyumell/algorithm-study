package boj.브론즈.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[10];
        int cnt = 0;
        boolean[] check = new boolean[42];

        for(int i =0; i< 10;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n[i] = Integer.parseInt(st.nextToken())%42;

            if (!check[n[i]]) {
                check[n[i]] = true;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
