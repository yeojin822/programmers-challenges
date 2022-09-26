package imyoi.kakao;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_KakaoTechInternship2022 {

    /**
     * #118667 두 큐 합 같게 만들기
     * @param queue1
     * @param queue2
     * @return 각 큐의 원소의 합을 같게 만들기 위해 필요한 작업의 최소 횟수
     */
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            sum1 += queue1[i];

            q2.add(queue2[i]);
            sum2 += queue2[i];
        }

        int count = 0;
        while (sum1 != sum2) {
            count++;

            if(count > (queue1.length + queue2.length) * 2) return -1;

            if (sum1 > sum2) {
                int val = q1.poll();
                sum1 -= val;
                sum2 += val;
                q2.offer(val);
            } else {
                int val = q2.poll();
                sum1 += val;
                sum2 -= val;
                q1.offer(val);
            }
        }
        return count;
    }
}