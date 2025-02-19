package boj.class2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i< n;i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        //for (int i =0; i < isPrime.length; i++) {
        //            isPrime[i] = true;
        //        }

        for(int i =0;i<n;i++){
            if (nums[i] == 1 || nums[i] == 0) {
                isPrime[i] = false;
            } else {
                for(int j =2; j < nums[i]; j++) {
                    if(nums[i] % j == 0) {
                        isPrime[i] = false;
                        break; // 놓칠뻔
                    }
                }
            }
        }

        int cnt = 0;
        for(int i =0; i < nums.length; i++){
            if (isPrime[i] == true){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
