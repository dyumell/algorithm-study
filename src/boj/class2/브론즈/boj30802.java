package boj.class2.브론즈;

import java.io.*;
import java.util.*;

public class boj30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int participants = Integer.parseInt(br.readLine()); // 참가자 수 입력

        // 셔츠 사이즈별 신청자 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] shirtsSize = new int[st.countTokens()];
        for (int i = 0; i < shirtsSize.length; i++) {
            shirtsSize[i] = Integer.parseInt(st.nextToken());
        }

        // 묶음 크기 입력
        st = new StringTokenizer(br.readLine());
        int shirtsPackSize = Integer.parseInt(st.nextToken());
        int penPackSize = Integer.parseInt(st.nextToken());

        // 최소 셔츠 묶음 개수 계산
        int minimumShirtsPack = 0;
        for (int i = 0; i < shirtsSize.length; i++) {
            if (shirtsSize[i] % shirtsPackSize != 0) {
                minimumShirtsPack += shirtsSize[i] / shirtsPackSize + 1;
            } else if (shirtsSize[i] % shirtsPackSize == 0) {
                minimumShirtsPack += shirtsSize[i] / shirtsPackSize;
            }
        }
        // 펜 묶음 개수 계산
        int minimumPenPack = participants / penPackSize;
        int remainingPens = participants % penPackSize;

        System.out.println(minimumShirtsPack);
        System.out.println(minimumPenPack + " " + remainingPens);
    }
}
