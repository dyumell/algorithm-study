package boj.브론즈.연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        for (int i =0; i< n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int highest = -1000000;
        int lowest = 1000000;
        for (int i =0; i<n; i++) {
            if ( highest < nums[i] ) {
                highest = nums[i];
            }
            if ( lowest > nums[i] ) {
                lowest = nums[i];
            }
        }

        System.out.println(lowest + " " + highest);
    }
}
