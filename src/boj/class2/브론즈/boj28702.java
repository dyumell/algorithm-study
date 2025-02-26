package boj.class2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = new String[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = br.readLine();
        }

        checkFizzBuzz(findNextValue(nums));
    }

    public static void checkFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }

    public static int findNextValue(String[] inputs) {
        int skipCount = 0;
        int result = 0;
        for (int i = inputs.length - 1; i >= 0; i--) {
            // 컴퓨터는 0 베이스인걸 자꾸 까먹니, i > 0  해서 첫번쨰 인덱스는 검사를 안했다.
            if (inputs[i].charAt(0) > 57) {
                // ascii 48 = 0 , ascii 57 = 9
                // 오류 , 음수일 경우 - 로 시작함으로 ascii >
                skipCount++;
            } else {
                result = Integer.parseInt(inputs[i]) + skipCount + 1;
                break;
            }
        }
        return result;
    }
}

