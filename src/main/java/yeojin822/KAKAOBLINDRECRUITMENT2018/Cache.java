package yeojin822.KAKAOBLINDRECRUITMENT2018;

import java.util.LinkedList;
import java.util.Queue;


/**
 * [17680] [1차] 캐시
 */
public class Cache {
    public int solution(int cacheSize, String[] cities) {
        int cache_hit = 1;
        int cache_miss = 5;
        Queue<String> queue = new LinkedList<>();
        int answer = 0;

        if(cacheSize == 0) return cache_miss * cities.length;

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            // queue에 있을경우
            if(queue.remove(city)){
                queue.add(city);
                answer += cache_hit;
            // queue에 없을 경우
            } else {
                if(queue.size() == cacheSize){
                    queue.poll();
                }
                queue.add(city);
                answer += cache_miss;
            }
        }
        return answer;
    }
}
