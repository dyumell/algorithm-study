package boj.브론즈.연산;

import java.util.*;
import java.io.*;

public class BOJ10250 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] w = new int[n];
        int[] h = new int[n];
        int[] x = new int[n];

        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        for ( int i =0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h[i] = Integer.parseInt(st.nextToken());
            w[i] = Integer.parseInt(st.nextToken());
            x[i] = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(findRoom(h[i],w[i],x[i])) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static int findRoom(int h,int w,int x) {
        int floor = (x % h == 0) ? h : x % h; // 이 부분은 엣지 케이스 돌렸는데
        int no = (x-1) / h + 1; // 이 부분에서 엣지 케이스를 빠뜨렸다.

        return (floor * 100) + no;
    }
}