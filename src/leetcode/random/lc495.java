package leetcode.random;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class lc495 {
    public static void main(String[] args) {
        String dir = "/testcases/lc495_1";
        int[] timeSeries = {89,231,368,841,1054,1258,1760,2216,2236,2243,2412,2780,2973,3326,3605,3966,4311,4565,4848,5001,5263,5538};
        int duration = 5;

        System.out.println(findPoisonedDuration(timeSeries,duration));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalPoisonedTime = 0;
        // 중독 끝나는 시점을 계산하기 위한 변수로 처음에는 배열을 사용했는데, 메모리 낭비같다. 일반 변수로도 가능 할 것
        // 중독 끝나는 시점을 저장하는 변수를 계속 덮어서 저장하면 됨
        int poisonedEndTime = 0;
        // 막 풀었는데, 중독 데미지 계산 시점을 일관적으로 해야함.
        // 중독 데미지 계산 시점은 timeSeries[i+1] 에서 계산할 것임으로, 시작 인덱스는 0이 아닌 1로 설정
        for (int i = 1; i < timeSeries.length; i++) {
            // 기본 로직 : 중독 상태에 걸리면 duration 만큼 중독 시간을 추가한다
            poisonedEndTime = timeSeries[i-1] + duration; // 이 위치에서 선언하면 i = 0 일 때는 조건없이 중독 지속시간이 추가되는 것 또한 반영이됨
            // *** 놓쳐서 심각한 에러 발생 : poisonedEndTime += duration 이 방식은 그냥 오류임. 조건을 반영한 로직이 아님
            // 위에 시작할 떄 일반 변수에 대해서 로직을 자세히했어야 실수를 안했을 것 같다.
            // 프로그램이 동작하는 기본적인 로직을 적어보고 조건 분기로 좁혀나간다
            if (poisonedEndTime >= timeSeries[i]) {
                // 중독 시간은 inclusive(포함된) time interval( 1 <= t < 2) 으로 비교 연산자 > 를 쓴다 -> 이 부분을 잘못 이해했다.
                // 1 <= t <= 2 가 맞는것이다.
                // 중독 종료시간보다 먼저 중독이 시작됨으로, 이전 중독 시작 시점부터 이번 중독 시작 시점까지 시간을 누적 중독 시간에 추가한다.
                totalPoisonedTime += timeSeries[i] - timeSeries[i-1];
            } else {
                totalPoisonedTime += duration;
            }
        }
        // 다 해놓고 마지막에 놓친 부분 : 마지막 인덱스에서 중독된 것은 계산하지 않았음으로 + duration 한다.
        totalPoisonedTime += duration;
        return totalPoisonedTime;
    }
}
