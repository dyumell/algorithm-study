package boj.새싹.반복;

import java.io.*;

public class BOJ2739 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int multiplicand = Integer.parseInt(br.readLine());
        int multiplier = 1;
        int[] product = new int[9];
        // Multiplication Table( 구구단 ) : multiplicand(곱해지는 수) multiplier(곱하는 수) product(곱셈 결과)
        // one times table ~ nine times table
        for (int i = 0; i < 9; i ++){
            product[i] = multiplicand * multiplier;
            bw.write(multiplicand + " * " + multiplier++ + " = "+ product[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
