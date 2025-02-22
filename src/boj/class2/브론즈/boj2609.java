package boj.class2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a > b){
            System.out.println(gcd(a,b));
        } else {
            System.out.println(gcd(b,a));
        }
        System.out.println(lcm(a,b));

    }

    public static int gcd(int a,int b) {
        while(true){
            if (a % b != 0) {
                // 1071 은 1029 로 나뉘어 떯어지지 않기 댸문에
                return gcd(b,a % b);
                // 1071 을 1029 로 나눈 나머지를 구하여, 1029 를 42로 나눈다.
            } else {
                // a % b == 0 : 1029 를 42로 나눈 나머지를 구한다 21, 42은 21로 나누어 떨어진다.
                return b;
            }
        }
    }

    public static int lcm(int a,int b){
        // 최소 공배수는 두 수를 곱하고 최대공약수로 나눈 것 과 같다.
        return a * b / gcd(a,b);
    }
}
