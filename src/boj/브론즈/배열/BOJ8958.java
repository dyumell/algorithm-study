package boj.브론즈.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];

        int seqCnt = 1;
        int score = 0;
        for(int i=0; i<n;i++){
            str[i] = br.readLine();
            for(int j = 0; j < str[i].length(); j++){
                switch (str[i].charAt(j)) {
                    case 'O':
                        score += seqCnt;
                        seqCnt++;
                        break;
                    case 'X':
                        seqCnt = 1;
                        break;
                }
            }
            sb.append(score).append("\n");
            seqCnt = 1;
            score = 0;
        }
        System.out.println(sb);
    }
}
