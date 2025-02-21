package boj.class2.브론즈;

import java.io.*;

public class boj1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;

            int j = str.length() - 1;

            int middle;
            middle = str.length() / 2;
            // 배열 인덱스 중간 구하는 방법

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (j == middle) {
                        bw.write("yes" + "\n");
                        break;
                    }
                } else {
                    bw.write("no" + "\n");
                    break;
                }
                j--;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
