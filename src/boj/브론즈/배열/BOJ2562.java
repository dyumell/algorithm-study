package boj.브론즈.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void solve() throws IOException {
        int[] arr = new int[9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for ( int i =0; i <arr.length;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int n = 0;
        int cnt = 0;
        for ( int i =0; i < arr.length;i++){
            if ( n < arr[i] ) {
                n = arr[i];
                cnt = i;
            }
        }

        System.out.println(n);
        System.out.println(cnt+1);
    }
}
