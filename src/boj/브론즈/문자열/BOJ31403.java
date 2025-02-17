package boj.브론즈.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ31403 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(a+b-c);
        System.out.println(Integer.parseInt(String.valueOf(a)+String.valueOf(b))-c);
        // 문자열에 가능한 연산들 찾기 -> 불가능한 연산은 컴파일 에러 
    }
}