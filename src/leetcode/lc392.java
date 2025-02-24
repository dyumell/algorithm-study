package leetcode;

public class lc392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        // a subsequence means original string or part of original string
        // ace is a subsequence of abcde

        int tmp = 0;
        int cnt = 0;

        // ### 설계 오류
        // 1. charAt(i) != charAt(j) 일 떄 return false; 로 해버림
        //  - 이렇게 설계하면 다음 알파벳이 다를시 무조건 false 반환
        // 2. tmp = j 로 설정함
        //  - 디음 반복에서 다음 알파벳이 아닌, 바로 전에 비교한 알파벳과 비교로 시작함
        for ( int i = 0; i < s.length(); i++) {
            for(int j = tmp; j < t.length(); j++) {
                char charS = s.charAt(i);
                char charT = t.charAt(j);
                if(s.charAt(i) == t.charAt(j)) {
                    tmp = j + 1;
                    cnt++;
                    break;
                }
            }
        }

        return cnt == s.length();

        // 반복을 하나만 두는건 자동화가 불가능했음
        // int j = 0;
        // for ( int i = 0; i < t.length(); i++) {
        //         if(s.charAt[j] == t.charAt[i]) {
        //             if (t.charAt[i] == s.charAt[++j])
        //         }
        //     }
        // }

        // string s, t
    }
}
