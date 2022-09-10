package imyoi.kakao;

import java.util.*;

public class Solution_KakaoBlind2021 {
    static String str;
    static HashMap<String, Integer> menu;
    static boolean isVisited[];
    static int max[];

    /**
     * #72411 메뉴리뉴얼
     * @param orders : 손님들이 주문한 단품메뉴들이 문자열 형식으로 담긴 배열
     * @param course : 코스요리를 구성하는 단품메뉴들의 갯수가 담긴 배열
     * @return "스카피"가 새로 추가하게 될 코스요리의 메뉴 구성을 문자열 형태로 배열에 담아 사전 순으로 오름차순 정렬해서 return
     * */
    public String[] solution01(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<String>();

        max = new int[course.length];
        menu = new HashMap<String, Integer>();
        for (int i = 0; i < orders.length; i++) {
            //손님이 주문한 메뉴 사전 순 정렬
            char a[] = orders[i].toCharArray();
            Arrays.sort(a);
            str = String.copyValueOf(a);

            //모든 조합 구하기
            for (int j = 0; j < course.length; j++) {
                isVisited = new boolean[str.length()];
                combination(0, 0, "", j, course[j]);
            }
        }

        for (String s : menu.keySet())
            for (int i = 0; i < course.length; i++)
                //2번 이상 선택되고 가장 많이 선택된 조합을 저장
                if (course[i] == s.length() && max[i] != 1 && menu.get(s) == max[i])
                    answer.add(s);

        return answer.stream().sorted().map(s -> s).toArray(String[]::new);
    }

    private void combination(int idx, int cnt, String s, int j, int N) {
        if (cnt == N) {
            menu.put(s, menu.containsKey(s) ? menu.get(s) + 1 : 1);
            max[j] = Math.max(max[j], menu.get(s));
            return;
        }
        for (int i = idx; i < str.length(); i++) {
            isVisited[i] = true;
            combination(i + 1, cnt + 1, s + str.charAt(i), j, N);
        }
    }
}