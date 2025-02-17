package boj.브론즈.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] str = new int[8];

        for (int i = 0; i < 8; i++) {
            str[i] = Integer.parseInt(st.nextToken());
        }

        int ascnt = 0;
        int dscnt = 0;
        for (int i = 0; i < 7; i++) {
            if (str[i+1] == str[i] + 1) {
                ascnt++;
            }
            if (str[i+1] == str[i] - 1) {
                dscnt++;
            }
        }
        if (ascnt == 7) {
            System.out.println("ascending");
        } else if (dscnt == 7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
