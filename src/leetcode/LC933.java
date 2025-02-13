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
                private Queue<Integer> requests;

                public RecentCounter() {
                    requests = new LinkedList<>();
                    // 요구사항 1구현
                }

                public int ping(int t) {
                    requests.add(t);
                    for(int i =0; i<requests.size();i++) {
                        if (!requests.isEmpty() && (t - requests.peek()) <= 3000) {
                            return requests.size();
                        } else if (!requests.isEmpty() && requests.peek() > 3000) {
                            requests.poll();
                        }
                    }
                    return 0;
                }
            }

            RecentCounter rc = null;
            String[] commands = {"RecentCounter", "ping", "ping", "ping", "ping"};
            String[] param = {"", "1", "100", "3001", "3002"};
            int i = 0;
            if (commands[0].equals("RecentCounter")) {

            }

            for (String command : commands) {
                if (command.equals("RecentCounter")) {
                    rc = new RecentCounter();
                    i++;
                } else if (param[i].equals("")){
                    continue;
                } else if (i == 1) {
                }
                else if (command.equals("ping") && Integer.parseInt(param[i]) > Integer.parseInt(param[i-1])) {
                    if (rc != null) {
                        int ans = rc.ping(Integer.parseInt(param[i++]));
                        System.out.println(ans);
                    } else {
                        System.out.println("RecentCounter is not running");
                    }
                }
            }
        }

    }

    /* 정답 코드
    import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.add(t);

        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }
}
     */
