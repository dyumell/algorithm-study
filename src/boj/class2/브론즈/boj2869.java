package boj.class2.브론즈;

import java.io.*;
import java.util.StringTokenizer;

public class boj2869 {
    public static void main(String[] args) throws IOException {

        long executionTime;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long up = Long.parseLong(st.nextToken());
        long down = Long.parseLong(st.nextToken());
        long destination = Long.parseLong(st.nextToken());

        // 시간 재는건 입력 끝난 뒤부터 하는게 맞다.
        long startTime = System.nanoTime();

//        // 비효율적인 반복을 개선해야함
//        while(true) {
//            current += up;
//            cnt++;
//            if(current < destination) {
//                current -= down;
//            } else {
//                executionTime = System.nanoTime() - startTime;
//                bw.write(cnt + " | time : ");
//                bw.write((executionTime / 1_000_000_000.0) + " s");
//                bw.flush();
//                break;
//            }
//        }

        // 반복을 사용하지 않고 O(1) 을 구현하기 위해서 수학 규칙을 찾아낸다.
        // (destination + down) / (up - down) <= N
        // n에 계수를 뺴고 destination 을 나눌 때 나누어 떨어지지 않는 경우 때문에 ceil() 이 필요
        // 계수를 나눌 때 소수점 자리가 누락되는 것을 예방하기 위해 중간에 double 을 사용
        long ans = (long) Math.ceil((double) (destination - down) / (up - down));
        // Math.ceil 을 까보면 Double 연산을 하기 댸문에 더 느릴 수 있음으로, 정수연산을 쓸 수 있을 떄 정수연산을 써라
       // 버퍼라이터는 한번만 호출하는게 더 빠르다.
        bw.write(ans + " | time : ");
        executionTime = System.nanoTime() - startTime;
        bw.write((executionTime / 1_000_000_000.0) + " s");
        bw.flush();
        bw.close();
        br.close();
    }
}
