package boj.새싹.함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2475 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        System.out.println(checkNumber(inputs));
        br.close();
    }

    public static int checkNumber(String[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i])*Integer.parseInt(nums[i]);
        }
        return (sum%10);
    }
}
