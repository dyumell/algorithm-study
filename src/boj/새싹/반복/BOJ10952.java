package boj.새싹.반복;

import java.io.*;

public class BOJ10952 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] inputsStr = br.readLine().split(" ");
            int[] inputs = new int[inputsStr.length];

            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = Integer.parseInt(inputsStr[i]);
            }

            if (inputs[0] == 0 && inputs[1] == 0) {
                break;
            }
            int sum = inputs[0] + inputs[1];
            bw.write(sum + "\n");
        }
        bw.flush();
        br.close();
    }
}