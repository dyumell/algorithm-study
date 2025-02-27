package leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class lc649 {
        public static void main(String args[]) {
            //String input="RD";
            String input = "RDD";
            System.out.println(predictPartyVictory(input));
        }
        // ### 설계 오류

        // 1. 단순 'r' , 'd' 개수만으로 문제 풀이
        //  먼저 투표권을 가진 사람들이 유리한 게임임으로, 순서가 중요하다. 이것을 구현하려면 개수 새는 것 만으로는 불가능하다.
        //  -> Queue 사용

        // 2. Queue 의 사용용도를 잘못 정함, 'RDRD' 이러한 인풋을 그대로 캐릭터 큐에 저장하고 순서대로 뺴면서 R이면 D인 요소를 빼려함
        //  그렇게 하기 위해서는 D의 인덱스까지 가서 제거해야하는데, 이렇게 뛰어넘을거면 Queue 쓰는 이유가 없음
        //  이것을 Random 접근이라고 한다

        // 3. Queue 문제임에도 불구하고, ArrayList 쓰려고함.
        //  ArrayList 는 랜덤 접근이 가능하지만, 삽입 삭제에대한 연산 속도가 느리다.
        //  따라서 성능을 확보하려면 순서 문제에서는 Queue 를 사용해야한다. ( 시간 복잡도 공부 )

        // 4. Queue 로 담을 대상을 정하는데 충분한 고려를 하지 않음
        //  1번에 설계 오류가 확장된 것인데, 이 문제를 Queue 로 풀려면 2번 처럼 하면 안된다.
        //  Queue 로 풀기 위해서는 문제의 요구사항에 맞게 순서를 처리하는 로직을 구현하기 위해 Queue 를 사용해야한다.
        //  Queue 로 담을 대상을 충분히 고려하기

        // 5. Queue 가 비었을 때 poll 하면 null 을 반환한다. 이것을 int 변수로 저장하려했다.
        //  이것을 설계할 떄 애초에 null 반환 경우를 생각을 못했음으로, 앞으로 주의하도록 한다.
        public static String attempt(String senate) {
            // # 문제 정리
            // 'R' 과 'D' 가 문자열에 여러번 찍혀있는데, 'R' 은 'D' 의 투표권을 없앨 수 있다.
            //  투표가 5:5 가 될 시 다음 라운드에서 계속 한다
            //  모든 투표권자들은 이기기 위해 최선의 수를 둔다. => 맨 앞의 투표권을 없앨 것이다.

            // # 문제 분석
            // 순서가 중요해보임 => QUEUE 를 쓰자
            // 주먹구구로 코드를 짜보니까 'R' 일떄 'D' 인 인덱스를 찾아서 뺴버리는게 핵심이었음 =? 인덱스를 QUEUE에 저장하자
            // **이렇게 되면 행동 하나 하나가 큐에 담기는 것과 똑같다.**
            Queue<Integer> queue = new LinkedList<Integer>();
            int length = senate.length();
            for(int i =0; i< length; i++) {
                if(senate.charAt(i) =='R') {
                    queue.offer(i);
                    for(int j = i ; j< length; j++) {
                        if(senate.charAt(j) =='D') {
                            queue.offer(j);
                        }
                    }
                } else {
                    queue.offer(i);
                    for(int j = i ; j< length; j++) {
                        if(senate.charAt(j) =='R') {
                            queue.offer(j);
                        }
                    }
                }
            }
            // 투표 과정에 대한 로직을 구현했다.
            // 이것은 엄청난 오류가 있다.
            // 일단 라운드가 끝나도 반반일 떄 다음 라운드로 넘어가야하지만, 그것에 대한 코드가 없기도 한데
            // 해당 코드를 구현하지 못할 수 밖에 없던 근본적인 이유는 한 큐에 'R','D' 인덱스를 다 넣어버리면
            // 의미가 없는 데이터가 되버린다. "순서대로" "처리" 할 수 없다.
            // 순서대로 처리하기 위해서 'R', 'D' 인덱스 큐를 각각 분리한다.
            // 처리 과정을 Queue 를 사용하여 구현한다는 접근 방식을 가지자
            return null;
        }

        public static String predictPartyVictory(String senate) {
            Queue<Integer> radiantQueue = new LinkedList<Integer>();
            Queue<Integer> direQueue = new LinkedList<Integer>();

            for(int i =0; i < senate.length(); i++){
                if(senate.charAt(i) == 'R') {
                    radiantQueue.add(i);
                } else {
                    direQueue.add(i);
                }
            }

            while(!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
                Integer radiantIdx = radiantQueue.poll();
                Integer direIdx = direQueue.poll();
                // 한쪽이 더 많은 경우, 한쪽은 비어있어서 null 을 int 변수에 담게 되면 NullPointException 이 발생함으로 예방한다.

                if (radiantIdx == null || direIdx == null) {
                    break;
                }

                if(radiantIdx < direIdx) {
                    // R 이 D 보다 앞에 있을 경우, D는 죽이고 R은 다음 라운드로 넘길 수 있게 살린다.
                    radiantQueue.offer(radiantIdx + senate.length());
                    // 이렇게 인덱스만 다시 붙히면 다시 투표하는게 아니라, 투표하고 바로 또하는 거다.
                    // 이게 잘못된 이유는 투표 순서를 큐에 저장하고있는건데, 투표를 한 인덱스를 투표햤던 바로 그순서에 다시 넣음으로  잘못된 것
                    // 한 라운드는 senate 수만큼 진행됨으로 senate.length() + idx 가 맞다

                    // 이 문제의 마지막 전제 조건으로, 모든 투표자는 이기기 위해서 최선의 수를 두는데
                    // 자기보다 앞에 있는 유권자의 투표를 금지한다. 이 코드 로직은 투표한 유권자를 다음 라운드로 넘기는데
                    // 진행중인 라운드에서 다음 라운드로 넘어간 유권자의 투표를 금지할 수 있음으로, 코드는 의도대로 설계됬다.
                } else {
                    direQueue.offer(direIdx + senate.length());
                }


            }
            if(!radiantQueue.isEmpty()){
                return "Radiant";
            } else {
                return "Dire";
            }
        }
}
