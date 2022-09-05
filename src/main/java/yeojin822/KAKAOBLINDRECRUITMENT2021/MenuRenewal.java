package yeojin822.KAKAOBLINDRECRUITMENT2021;

import java.util.*;

/**
 * [72411] 메뉴 리뉴얼
 */
public class MenuRenewal {
    List<String> list;
    Map<String, Integer> hashMap = new HashMap<>();

    public String[] solution(String[] orders, int[] course) {
        list = new ArrayList<>();
        // 1. order 정렬
        for (int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }

        // 2. order를 기준으로 length 만큼의 조합 만들기
        for (int len : course) {
            for (String order : orders)
                combi("", order, len);

            // 3. 가장 많은 조합 list에 저장
            if (!hashMap.isEmpty()) {
                List<Integer> countList = new ArrayList<>(hashMap.values());
                int max = Collections.max(countList);

                if (max > 1)
                    for (String key : hashMap.keySet())
                        if (hashMap.get(key) == max)
                            list.add(key);
                hashMap.clear();
            }
        }
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }

    public void combi(String order, String others, int count) {
        // 탈출 조건 : count == 0
        if (count == 0) {
            hashMap.put(order, hashMap.getOrDefault(order, 0) + 1);
            return;
        }

        // 0부터 length까지 조합
        for (int i = 0; i < others.length(); i++)
            combi(order + others.charAt(i), others.substring(i + 1), count - 1);
    }
}
