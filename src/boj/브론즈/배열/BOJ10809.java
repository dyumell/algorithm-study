package boj.브론즈.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] alphabetCnt = new int[26];
        boolean[] alphabetCheck = new boolean[26];

        for(int i =0; i < str.length(); i++) {
            if (!alphabetCheck[str.charAt(i)-97]){ // 첫번쨰 조건을 유심히 봐야했음
            alphabetCnt[str.charAt(i) - 97]=i;
            alphabetCheck[str.charAt(i)-97]= true;
            }
        }

        StringJoiner sj = new StringJoiner(" ");
        for(int i =0; i < alphabetCnt.length; i++) {
            sj.add(alphabetCheck[i] ? String.valueOf(alphabetCnt[i]) : "-1");
        }
        System.out.println(sj);
    }
}
