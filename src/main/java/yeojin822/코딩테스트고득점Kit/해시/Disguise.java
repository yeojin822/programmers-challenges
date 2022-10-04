package yeojin822.코딩테스트고득점Kit.해시;

import java.util.HashMap;

/**
 * [42578] 위장
 */
public class Disguise {
    public int solution(String[][] clothes) {
        int answer = 1;

        // type별로 옷 종류가 몇개인지 세기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 1) + 1);
        }

        for (String key : map.keySet()) {
            answer *= map.get(key);
        }

        //아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }

}
