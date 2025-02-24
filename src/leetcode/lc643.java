package leetcode;

public class lc643 {
    public static void main(String[] args) {
        // edge case
        int[] n = {-1};
        int k = 1;

        System.out.println(findMaxAverage(n,k));
    }

    // ### 설계 오류
    // 1. 반복을 강제하는 패턴으로 만듬
    // 2. 비교하는 최하 숫자에 음의 정수를 고려하지 않음
    // 3. j 의 종료조건을 잘못 정함

    // ### 고려사항
    // 1. 계산 오차 범위에 대해서 어떤 것을 인지하고 long, double 을 사용할지 공부

     public static double findMaxAverage(int[] nums, int k) {
        // find a subsequent subarray that lengths of it is equal to variable k
        // that the array has the maximum average value, and return this value.
        // calculation error less than 10^-5

        // e.g
        // nums = [1,12,-5,-6,50,3] , k = 4
        // arr = [12,-5,-6,50] // subarray is subsequent, has maximum average

        // ### possibility of subarray
        // 1 2 3 4 5 6 7
        // 7 - 4 + 1
        // nums.length() - k + 1
        // 하지만 이런 접근법은 반복을 강제함으로, 안티패턴일 듯 하다.
        // int length = nums.length() - k + 1 ;
        // int[] subarrays = new int[length];

        // attention to the value of priorSum. if it's 0, it works with Positive Integer
        // but when it comes to Negative Integer, it goes Boom
        // conclusion : set priorSum the lowest Integer
        int priorSum = Integer.MIN_VALUE;
        for(int i =0; i< nums.length - (k-1); i++) {
            // 이 부분을 컴퓨터가 동적으로 반복하게 해야한다.
            // int sum = nums[i] + nums[i+1] + nums[i+2] + nums[i+3];
            int sum = 0;
            // caution on j loop end condition : start with i, end at i + 3.
            // thus, the range limit has to be i + k.
            // I put i + k -1 , silly me
            for(int j = i; j< i + k;j++){
                sum += nums[j];
            }
            if (priorSum < sum)
                priorSum = sum;
        }
        // be careful not to miss the calculation error condition.
        // what could be different if using long instead of double
        return (double)priorSum / k ;
    }
}
