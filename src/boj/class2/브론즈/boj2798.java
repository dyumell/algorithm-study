package boj.class2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cardsTotal = Integer.parseInt(st.nextToken());
        int blackJackNo = Integer.parseInt(st.nextToken());

        int[] cards = new int[cardsTotal];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < cardsTotal; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for (int i = 0; i < cards.length-2; i++) {
            for (int j = i+1; j < cards.length-1; j++) {
                for (int k = j+1; k < cards.length; k++) {
                    // 중첩 반복을 사용해서 모든 요소에 대해 비교 하는 방법
                    if (ans < cards[i] + cards[j] + cards[k] &&
                            blackJackNo >= cards[i] + cards[j] + cards[k])
                    // 조건을 튜닝해서 성능을 개선 -> 먼저 검사하는 게 무엇인지
                    {
                        ans = cards[i] + cards[j] + cards[k];
                    }
                }
            }
        }
        System.out.print(ans);
    }

}
