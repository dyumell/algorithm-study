package leetcode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LC1768 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first_input = br.readLine();
        String second_input = br.readLine();

        LC1768 LC1768 = new LC1768();

        bw.write(LC1768.mergeAlternately(first_input,second_input));
        bw.flush();
        bw.close();
        br.close();
    }

    public String mergeAlternately(String word1, String word2) {
        // if word1 > word2
        int maximum_length = word1.length() + word2.length();

        char[] merged_string = new char[maximum_length];
        // 25.02.10 String merged = new String() : 문자열 생성 후 인덱스로 수정 불가 (immutable)
        int merged_string_cursor = 0;
        int i =0; int j= 0;
        while(i < word1.length() || j < word2.length()) {
            if (i < word1.length()){
                merged_string[merged_string_cursor] = word1.charAt(i);
                merged_string_cursor++;
                i++;
            }
            if (j < word2.length()){
                merged_string[merged_string_cursor] = word2.charAt(j);
                merged_string_cursor++;
                j++;
            }
        }

        // 25.02.10 char -> String 으로 명시적 형변환이 필요함 
        return new String(merged_string);
    }
}