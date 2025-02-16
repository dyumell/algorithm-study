package boj.브론즈.연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ2338 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine()); // 1000자리 숫자 입력
        BigInteger b = new BigInteger(br.readLine());

        System.out.println(a.add(b));      // 덧셈
        System.out.println(a.subtract(b)); // 뺄셈
        System.out.println(a.multiply(b)); // 곱셈
    }
}
