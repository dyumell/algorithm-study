package boj.class2.실버;

import java.io.*;
import java.util.StringTokenizer;

public class RANK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine);
        // 공식문서에서는 StringTokenizer 는 레거시 코드임으로 regex 나 String.split() 사용을 권장
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] weight = new int[n];
        int[] height = new int[n];
        int[] rank = new int[n]; // 체중과 키 변수만으로는 RANK 를 구현하는데 어려움이 있다. 못할 건 없지만, 연산이 길어진다.
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            weight[i] = Integer.parseInt(input[0]);
            height[i] = Integer.parseInt(input[1]);
            rank[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (weight[i] < weight[j] && height[i] < height[j]) {
                    rank[i]++;
                }
            }
            bw.write(rank[i] + " ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}


