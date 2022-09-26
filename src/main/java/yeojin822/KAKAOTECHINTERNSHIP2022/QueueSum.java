package yeojin822.KAKAOTECHINTERNSHIP2022;

import java.util.LinkedList;
import java.util.Queue;


/**
 * [118667] 두 큐 합 같게 만들기
 */
public class QueueSum {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;

        for(int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }

        while(sum1 != sum2) {
            answer++;

            if(sum1 > sum2) {
                int value = q1.poll();
                sum1 -= value;
                sum2 += value;
                q2.offer(value);
            } else {
                int value = q2.poll();
                sum1 += value;
                sum2 -= value;
                q1.offer(value);
            }

            if(answer > queue1.length * 3) {
                answer = -1;
                break;
            }
        }


        return answer;
    }
}
