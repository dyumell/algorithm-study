package boj.조건문;

import java.io.*;

public class BOJ1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int input1 = Integer.parseInt(inputs[0]); int input2 = Integer.parseInt(inputs[1]);
        if (input1 > input2) {
            bw.write(">");
        } else if (input1 == input2) {
            bw.write("==");
        } else {
            bw.write("<");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
