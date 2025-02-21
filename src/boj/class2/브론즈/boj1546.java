package boj.class2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[n];

        for (int i =0; i< n;i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int highest = 0;
        for (int i=0; i< n; i++){
            if( highest < scores[i] ) {
                highest = scores[i];
            }
        }

        double sum = 0;
        for (double score : scores) {
            sum += score / highest * 100;
        }

        double ans = sum / n;

        System.out.println(ans);
    }
}
