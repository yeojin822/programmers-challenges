package imyoi.kakao;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_KakaoInternship2019 {

    /**
     * #64065 튜플
     * - 중복된 원소가 있을 수 있다 ex: (2,3,1,2)
     * - 원소에 정해진 순서가 있으며, 원소의 순서가 다르면 서로 다른 튜플이다 ex: (1,2,3) != (1,3,2)
     * - 튜플의 원소 개수는 유한하다
     * @param s : 튜플을 표현하는 집합이 담긴 문자열
     * @return s가 표현하는 튜플을 배열에 담아 리턴
     * */
    public int[] solution(String s) {
        HashSet<Integer> set = new HashSet<Integer>();
        String[] sArr = s.replaceAll("[{}]", " ").trim().split(" ,");
        Arrays.sort(sArr, (a, b)->(a.length()-b.length())); //길이 오름차순 정렬

        int[] answer = new int[sArr.length];

        int i = 0;
        for(String a : sArr) {
            for(String str : a.split(",")) {
                int num = Integer.parseInt(str.trim()); //각각의 숫자
                if(set.contains(num)) continue;
                set.add(num);
                answer[i++] = num;
            }
        }
        return answer;
    }
}