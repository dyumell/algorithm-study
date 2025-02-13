package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;

public class LC933 {
    // 문제. 특정시간 안에 최근 요청을 카운트 하는 RecentCounter 클래스를 작성하시오
    // 요구사항1 : 생성자는 0개의 요청으로 초기화합니다.
    // 요구사항2 : int ping(int t) : t(milli-sec) 시각에 요청을 추가하고, 새 리퀘스트를 포함한 3000 ms 안에 받은 요청 개수를 받환합니다.
    // (t - 3000 ~ t)
    // 요구사항3 : **ping 함수가 호출 될 떄 마다, 이전 ping 보다 더 큰 t 를 가져야합니다**

    /*
    You have a RecentCounter class which counts the number of recent requests within a certain time frame.

    Implement the RecentCounter class:

    RecentCounter() Initializes the counter with zero recent requests.
    int ping(int t) Adds a new request at time t, where t represents some time in milliseconds,
    and returns the number of requests that has happened in the past 3000 milliseconds (including the new request).
    Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
    It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
     */

    public static void solve() throws IOException {
        // 25.02.13 : 접근제한자, 클래스 배치에서 의문점 : 어떤게 객채지향적인거지?
        class RecentCounter {
            // 25.02.13 : 나는 컬렉션 자료형에서 ArrayList 밖에 몰라서 그걸 쓰려 했으나, 문제에서 FIFO 구조로 된 Queue 사용을 권장함
            // Queue 는 인터페이스임, LinkedList 는 구현체임
            private Queue<String> requests;

            public RecentCounter() {
                requests = new LinkedList<>();
                // 요구사항 1구현
            }

            public int ping(int t) {
                return 0;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (br.readLine().equals("RecentCounter")) {
            RecentCounter rc = new RecentCounter();

        }
    }

}
