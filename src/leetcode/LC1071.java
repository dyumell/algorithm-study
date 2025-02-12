package leetcode;

import java.io.*;

public class LC1071 {
    public static void solve() throws IOException {
        String s; String t;
        // t로 s를 나눌수 있는 최대 서브 스트링
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string s: ");
        s = br.readLine();

        System.out.print("Enter string t: ");
        t = br.readLine();
        System.out.println("s length : "+s.length() + " | t length : " + t.length());

        // int r = 0;
        StringBuilder sb = new StringBuilder();
//        for (int i =0; i< s.length(); i++){
//            for(int j =0; j< t.length(); j++){
//
//                if (s.charAt(i) == t.charAt(j)){
//                   sb.append(s.charAt(i));
//
//                   // 1. 엣지 케이스 s : sd t : dss -> sd
//
//                   // 2.  r=j , j=r 이렇게 짜면 첫번쨰 if 문이 false 일 떄 무한 루프에 빠진다. 25.02.12
//                   break;
//                   // 3. 문자열 for 문 2개로 char 하나씩 비교하는 접근법은 틀림
//                    // -> 공통된 부분을 찾는게 아니기 떄문, 두 문자열의 일부가 겹치는지만 확인하는 방식
//                }
//            }
//        }
        System.out.println(sb);


    }

    public static void test() throws IOException {
        // 문제. 주어진 두 문자열 s , t 에서 **두 문자열을 반복해서 만들수 있는 가장 긴 공통 문자열 찾기**
        String s = "ABCABC";
        String t = "ABC";
        // ABCABC 는 ABC 가 두번 반복된 형태
        // ABC 는 ABC 가 한번 반복된 형태 ( 최대 공약 수(Great Common Divisor)와 비슷하다. )

        s = "LEET";
        t = "CODE";
        // LEET 와 CODE 는 공통되는 패턴이 없음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("str1 : ");
        s = br.readLine();

        System.out.print("str2 : ");
        t = br.readLine();

        String ans;

        // 접근 방법 1. 두 문자열이 반복 가능한 형태인지 확인
        if (!(s + t).equals(t + s)) {
            System.out.println("두 문자열이 서로 배수 관계가 아님");
            ans = "";
            System.out.println(ans);
        }

        // 접근 방법 2. 반복 가능한 문자열일 떄, 문자열 길이의 최대 공약수 구하기
        int gcdLength = gcd(s.length(), t.length());
        ans = t.substring(0, gcdLength);

        System.out.println("Output: "+ans);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
        // 유클리드 호제법 원리
        // a % b 를 b 가 0 이 될 떄까지 반복
        // O(logN) 속도로 최대 공약수 구함
    }

//    public static int gcd(int a, int b) {
//        if (b == 0) {   // b가 0이면, 최대공약수는 a
//            return a;
//        } else {
//            return gcd(b, a % b);  // 재귀 호출
//        }
//    }

}
