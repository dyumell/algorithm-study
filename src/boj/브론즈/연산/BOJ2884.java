package boj.브론즈.연산;

import java.io.*;
import java.util.*;

public class BOJ2884 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[2];

        for (int i =0; i< 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        arr[1] -= 45;

        if (arr[1] < 0) {
            arr[1] = 60 - arr[1] * -1 ;
            if (arr[0] == 0) {
                arr[0] = 23;
            } else {
                arr[0] -= 1;
            }
        }
        System.out.print(arr[0] + " " + arr[1]);
    }
}