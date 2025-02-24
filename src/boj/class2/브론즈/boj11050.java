package boj.class2.브론즈;

import java.io.*;
import java.util.StringTokenizer;

public class boj11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        // 이항 계수는 그 증명이 잘 이해가 안된다.
        // 선수개념 : 조합, 팩토리얼, 순열

        System.out.print(calculate_combination(n,r));
    }

    public static int calculate_combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}

