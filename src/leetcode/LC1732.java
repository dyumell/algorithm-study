package leetcode;

import java.io.*;
import java.util.Arrays;

public class LC1732 {
    public static void solve() throws IOException {
        // 문제. 바이커가 고도가 0인 지점에서 다른 지점들로 이동하는데 최대 고도 기록을 구하라
        //There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
        //The biker starts his trip on point 0 with altitude equal 0
        // You are given an integer array gain of length n where gain[i] is **the net gain in altitude**
        // between points and i + 1 for all (0 <= i < n)
        // return the highest altitude

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("n : ");
        int n = Integer.parseInt(br.readLine());

        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("gain["+i+"] : ");
            gain[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Gain : " + Arrays.toString(gain));
        for (int netGain : gain) {
            System.out.println(netGain);
        }

        int tmp = 0;
        int highest = 0;
        // 최대값 구하는 로직, 배열 gain 에 대해서 모든 값을 누산한 값과 비교해서 더 큰값을 저장하는 방식
        for (int i =0; i<n; i++){
            // gain[0] 부터 gain[i] 까지 더한 값을 tmp에 할당
            tmp += gain[i];
            if ( highest < tmp )
                highest = tmp;
        }

        System.out.println("highest altitude : " + highest);
    }
    // 시간복잡도 : O(n)
}
