package boj.브론즈.문자열;

import java.io.*;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = new String[3];
        n[0] = br.readLine();
        n[1] = br.readLine();
        n[2] = br.readLine();

        String sum = String.valueOf((Integer.parseInt(n[0]) * Integer.parseInt(n[1]) * Integer.parseInt(n[2])));
        int[] cnt = new int[10];
        for(int i = 0; i < 10; i++) {
            for(int j =0; j < sum.length(); j++) {
                if(sum.charAt(j) == (char)(i + '0')){ // 페인 포인트는 여기
                    cnt[i]++;
                }
            }
            bw.write(String.valueOf(cnt[i])+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
