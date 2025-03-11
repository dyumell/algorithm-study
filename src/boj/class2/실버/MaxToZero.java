package boj.class2.실버;
import java.io.*;
public class MaxToZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean isPackagable = false;


        for (int i = n / 5; i >= 0; i--) {
            int remain = n - (5 * i);
            if (remain % 3 == 0) {
                System.out.print(i + (remain / 3));
                isPackagable = true;
                break;
            }
        }


        if (!isPackagable) {
            System.out.print(-1);
        }
    }
}