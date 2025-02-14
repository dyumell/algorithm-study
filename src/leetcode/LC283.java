package leetcode;

public class LC283 {
    public void moveZeroes(int[] nums) {
        // 0 가 있으면, 오른쪽으로 쭉 당기라. 나머지 요소의 순서는 유지하면서, 조건은 배열 복사를 금한다.
        //  in-place -> 원본배열만 사용할 것

        // int tmp = 0;
        // for (int i = 0; i < nums.length ; i++) {
        //     if (nums[i] == 0 && i < nums.length -1) {
        //         tmp = nums[i];
        //         nums[i] = nums[i+1];
        //         nums[i+1] = tmp;
        //     } else if (nums[i] == 0 && i == nums.length) {
        //         tmp = nums[i];
        //         nums[i] = nums[i-1];
        //         nums[i-1] = tmp;
        //     }
        // }
        // 이런 방식으로는 한칸 밖에 못밀어냄

            /* 접근 2 - 25.02.14
            0이 발견된 인덱스를 저장하는 배열(리스트) 생성
            0이 아닌 숫자를 찾을 때, 리스트에서 저장된 0의 위치에 먼저 넣음
            모든 숫자가 이동된 후, 리스트에 저장된 개수만큼 배열 끝에 0을 채움

            => 이 방식은 O(n) 으로 in-place 도 지키지 않는다, 반복을 너무 많이한다
             */

        // 문제는 2 pointer 방식을 권장함
        int nonZeroIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIdx++] = nums[i];
            }
        }
        // 0이 아닌 숫자를 정렬함

        // 나머지를 0으로 채움
        for (int i = nonZeroIdx; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
