package boj.오글거리는문제들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2402 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);

        long ans = 0;
        if (a > b) {
            ans = b - a;
            if (ans > 0) {
                System.out.println(ans);
            } else {
                System.out.println(-1 * ans);
            }
        } else {
            ans = a - b;
            if (ans > 0) {
                System.out.println(ans);
            } else {
                System.out.println(-1 * ans);
            }
        }
    }
}
