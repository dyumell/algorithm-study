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

        int r = 0;
        StringBuilder sb = new StringBuilder();
        for (int i =0; i< s.length(); i++){
            for(int j =0; j< t.length(); j++){
                j = r;
                if (s.charAt(i) == t.charAt(j)){
                   sb.append(s.charAt(i));
                   r = j;
                   // r=j , j=r 이렇게 짜면 첫번쨰 if 문이 false 일 떄 무한 루프에 빠진다.
                   break;
                }
            }
        }
        System.out.println(sb);


    }
}
