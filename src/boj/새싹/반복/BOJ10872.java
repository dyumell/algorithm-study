package boj.새싹.반복;

import java.io.*;

public class BOJ10872 {
   public static void solve() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int input = Integer.parseInt(br.readLine());

       int i = input;
       int factorial = 1;
       if (input != 0) {
           while (i >= 1) {
               factorial = factorial * i--;
           }
       }
       bw.write(String.valueOf(factorial));
       bw.flush();
       bw.close();
       br.close();
   }
}
