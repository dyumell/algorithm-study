package boj.class2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] inputs = br.readLine().split(" ");
            int[] lines = new int[3];
            for (int i =0; i< lines.length;i++){
                lines[i] = Integer.parseInt(inputs[i]);
            }

            // 종료 조건 입력 : 0 0 0
            if (lines[0] == 0 && lines[1] == 0 && lines[2] == 0) {
                break;
            }

            int hypotenuse = 0;
            int tmp = 0;
            boolean[] hypotenuseCheck = new boolean[3];
            // 하이-파-터누스
            for (int i = 0; i< lines.length;i++) {
                if (hypotenuse < lines[i]) {
                    hypotenuse = lines[i];
                    tmp = i;
                }
            }
            hypotenuseCheck[tmp] = true;

            int[] notHypotenuse = new int[2];
            int j = 0;
            for(int i =0; i< 3; i++) {
                if(!hypotenuseCheck[i]) {
                    notHypotenuse[j] = lines[i];
                    j++;
                }
            }
            if ( hypotenuse * hypotenuse != notHypotenuse[0] * notHypotenuse[0] + notHypotenuse[1] * notHypotenuse[1]) {
                sb.append("wrong");
            } else {
                sb.append("right");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
