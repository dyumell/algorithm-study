package leetcode;

public class lc605 {
    public static void main(String[] args){
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;

        System.out.println(canPlaceFlowers(flowerbed,n));
    }
    // ### 설계오류
    // 1. 일단 문제를 제대로 안읽고 풀었다. 엄청 틀렸다
    // 2. if 안애 내용물 없으면 반대 조건으로 내용물 있게 해라, 코드가 비효율적이다.

    // ### 고려사항
    // 1. 제일 흔한 조건을 맨 앞에 둠으로서 코드 효율성 높임
    // ***2. 그렇다면 코드 효율이라는게 무엇인지? 불필요한 코드 줄인다고 시공간적으로 어떻게 향상되는지

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // long flowerbed , some of the plots are planted , cannot be planted in right next to neighbor flower.
        // adjacent : 인접한, plot : 땅의 작은 구역
        // flowerbed containing 0(empty) and 1(planted)
        // return true if n of new flower can be platned on the flowerbed
        int length = flowerbed.length;
        int cnt = 0;
        // make sure checked and planted plot index to be changed 0 to 1
        for(int i =0; i < length; i++) {
            if (flowerbed[i] == 0) {
                if (i != 0 && i != length -1) {
                    if(flowerbed[i+1] == 1 || flowerbed[i-1] == 1) {

                    }
                    else {
                        flowerbed[i] = 1;
                        cnt++;
                    }
                } else if ( length == 1) {
                    if (flowerbed[i] == 1) {

                    } else {
                        cnt++;
                    }
                }
                else if (i == 0) {
                    if(flowerbed[i+1] == 1) {

                    }
                    else {
                        flowerbed[i] = 1;
                        cnt++;
                    }
                } else {
                    if(flowerbed[i-1] == 1) {

                    }
                    else {
                        flowerbed[i] = 1;
                        cnt++;
                    }
                }
            }
        }

        return cnt >= n;
    }
}
