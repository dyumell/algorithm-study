package boj.배열;

import java.io.*;

public class BOJ10871 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        int input = Integer.parseInt(br.readLine());


        String[] array = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < length ; i++) {
            if (i == length-1 && input > Integer.parseInt(array[i])) {
                sb.append(array[i]);
            } else if (input > Integer.parseInt(array[i])) {
                sb.append(array[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
