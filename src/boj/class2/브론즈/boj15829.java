package boj.class2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();

        System.out.println(encodeHash(str));
    }

    public static long encodeHash(String str) {
        long result = 0;
        long M = 1234567891;

        long[] r = new long[str.length()];
        Arrays.fill(r,1L);
        for(int i =0; i< str.length();i++){
            for(int j = i; j > 0; j--) {
                r[i] *= 31;
            }
        }

        for (int i = 0; i< str.length(); i++) {
            result = ((str.charAt(i) - 48) * r[i]) % M;
        }

        return result;
    }
}
