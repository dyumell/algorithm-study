package boj.브론즈.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();;
        int n = Integer.parseInt(br.readLine());

        int[] length = new int[n];
        String[] str = new String[n];
        for(int i =0; i< n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            length[i] = Integer.parseInt(st.nextToken());
            str[i] = st.nextToken();

            for(int j=0 ; j < str[i].length();j++) {
                sb.append(String.valueOf(str[i].charAt(j)).repeat(length[i]));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
