package leetcode;

public class lc724 {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.print(pivotIndex(nums));
    }
    // ### 설계 오류
    // 1. 처음에는 브루트 포스 문제인줄 알았다.
    // 2. 우합 좌합 계산식 오류
    //      -> 직접 배열 그려서 피봇을 만들어 규칙을 파악해 수식을 맞게 변경함

    public static int pivotIndex(int[] nums) {
        // pivot index : an index that the left sum and the right sum are equal.
        // strictly to the left / right  of the index : index must not be included in either the left or the right
        // if index is 0, left sum is 0. also applied to last index with right sum.
        // return the leftmost pivot index. if no such index exist, return -1


        // 컴퓨터가 동적으로 반복시켜야할 것 같은 구간 ( 연산 횟수가 동적임으로 )
        int n = nums.length;
        for (int pivot = 0; pivot < n; pivot++) {
            int leftSum = 0;
            for (int i =0; i < pivot; i++) {
                // let's solve this with brute force
                // leftSum : 0 ~ pivot -1
                leftSum +=nums[i];
            }
                /*
                1 3 9 4 8 2 4 6
                        o
                1 3 9 4 8 2 4 6
                      o
                1 3 4 8 7 3 6 4 7
                  o
                */
            // rightSum : pivot + 1 ~ n
            int rightSum = 0;
            for (int j =pivot + 1; j < n; j++ )
                rightSum += nums[j];
            if (leftSum == rightSum){
                return pivot;
            }
        }
        return -1;
    }
}
