package yeojin822.KAKAOBLINDRECRUITMENT2021;

import java.util.*;

/**
 * [72412] 순위 검색
 */
public class Ranking {
    static HashMap<String, ArrayList<Integer>> map;

    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        map = new HashMap<>();

        //모든 경우의 수 구해서 map key 생성
        for (String s : info) {
            String[] inf = s.split(" ");
            dfs(inf, "", 0);
        }
        // 바이너리서치를 위해 점수를 오름차순으로 정렬한다.
        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
        }

        // 키를 찾은 후 바이너리서치로 해당값 비교 구하기
        for (int i = 0; i < query.length; i++) {
            String[] q = query[i].replace(" and "," ").split(" ");
            String key = q[0] + q[1] + q[2] + q[3];
            answer[i] =  binarySearch(key, Integer.parseInt(q[4]));
        }

        return answer;
    }


    static void dfs(String[] inf, String str, int idx) {
        if (idx == 4) {
            if (!map.containsKey(str)) {
                ArrayList<Integer> list = new ArrayList<>();
                map.put(str, list);
            }
            map.get(str).add(Integer.parseInt(inf[4]));
            return;
        }else {
            dfs(inf, str + "-", idx + 1);
            dfs(inf, str + inf[idx], idx + 1);
        }
    }

    static int binarySearch(String key, int score) {
        if(map.get(key) == null){
            return 0;
        }
        List<Integer> list = map.get(key);

        int start = 0, end = list.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) < score)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return list.size() - start;
    }
}
