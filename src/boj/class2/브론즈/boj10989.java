package boj.class2.브론즈;

import java.io.*;

public class boj10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];

        // 버블 정렬은 O(n^2) 로 타임아웃 뜸
//        for(int i =0; i < n; i++) {
//            nums[i] = Integer.parseInt(br.readLine());
//        }
//
//        int tmp;
//        for(int i =0; i<n; i++) {
//            for(int j = i+1; j < n; j++) {
//                if(nums[i] > nums[j]) {
//                    tmp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = tmp;
//                }
//            }
//        }

        // 퀵 정렬 (O(logN * N))

        // 카운트 정렬 O(n)
        int[] count = new int[10001];  // 입력값 범위: 1 ~ 10000

        // 입력받은 숫자 개수 저장
        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        // 카운팅 정렬 결과 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                bw.write(i + "\n");
                count[i]--;
            }
        }

        br.close();
        bw.flush();
        bw.close();

        for(int i =0; i<n; i++) {
            System.out.print(nums[i] + "\n");
        }
    }
}
