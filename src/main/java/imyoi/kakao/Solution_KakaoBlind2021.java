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

    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * #72412 순위검색
     * - [조건]을 만족하는 사람 중 코딩테스트 점수를 X점 이상 받은 사람은 모두 몇 명인가?
     * @param info : 지원자가 지원서에 입력한 4가지의 정보와 획득한 코딩테스트 점수를 하나의 문자열로 구성한 값의 배열
     *             지원자가 지원서에 입력한 4가지 값과 코딩테스트 점수를 합친 "개발언어 직군 경력 소울푸드 점수" 형식
     * @param query : 개발팀이 궁금해하는 문의조건이 문자열 형태로 담긴 배열
     *              [조건]은 "개발언어 and 직군 and 경력 and 소울푸드" 형식의 문자열
     * @return 각 문의조건에 해당하는 사람들의 숫자를 순서대로 배열에 담아 return
     * */
    static Map<String, List<Integer>> infos = new HashMap<>();
    public int[] solution02(String[] info, String[] query) {
        for(String s : info) {
            set(0, "", s.split(" "));
        }
        for(String key : infos.keySet()) {
            Collections.sort(infos.get(key)); //점수 오름차순정렬
        }

        int[] answer = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            String[] split = query[i].split(" and | ");
            //문자열 배열 이어 붙이기
            String key = String.join("", split[0], split[1], split[2], split[3]);
            int score = Integer.parseInt(split[4]);

            //키가 있으면 value값 반환, 없으면 기본값 반환
            List<Integer> list = infos.getOrDefault(key, new ArrayList<Integer>());
            int start = 0;
            int end = list.size();

            //이분탐색
            while (start < end) {
                int mid = (start + end) / 2;
                if (list.get(mid) < score) {
                    start = mid + 1;
                }else {
                    end = mid;
                }
            }
            answer[i] = list.size() - start;
        }

        return answer;
    }

    private static void set(int idx, String s, String arr[]) {
        if(idx == 4) {
            //key값이 존재하는 경우 map안에 있는 value를 반환 (첫번째 인자)
            //key값이 존재하지 않는 경우 map에 새로운 key와 value값을 저장한다 (두번째 인자)
            infos.computeIfAbsent(s, k -> new ArrayList<Integer>()).add(Integer.parseInt(arr[4]));
            return;
        }
        set(idx+1, s+arr[idx], arr);
        set(idx+1, s+"-", arr);
    }
}