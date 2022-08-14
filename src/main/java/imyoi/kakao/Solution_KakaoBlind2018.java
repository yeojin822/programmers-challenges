package imyoi.kakao;

import java.util.ArrayList;
import java.util.List;

public class Solution_KakaoBlind2018 {

    /**
     * #17677 [1차] 뉴스 클러스터링
     * 자키드 유사도 : 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의
     * @param str1
     * @param str2
     * @return
     * */

    List<String> union = new ArrayList<>(); //합집합
    List<String> intersection = new ArrayList<>(); //교집합

    public int solution01(String str1, String str2) {
        List<String> list1 = multiset(str1.toUpperCase());
        List<String> list2 = multiset(str2.toUpperCase());

        for(String s : list1) {
            if(list2.remove(s)) { //s가 집합2에 있다면 삭제 후 교집합에 추가
                intersection.add(s); //교집합에 추가
            }
            union.add(s); //집합1 합집합에 추가
        }

        //위에서 제거되고(교집합) 외 나머지 값 합집합에 추가
        for(String s : list2) {
            union.add(s);
        }

        //두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의
        if(union.size() == 0) return  65536;

        //자카드 유사도
        double jaccard = (double)intersection.size() / (double)union.size();
        jaccard = Math.floor(jaccard*65536);

        return (int) jaccard;
    }

    static List<String> multiset(String s) {
        List<String> lst = new ArrayList<>();

        for(int i=0; i<s.length()-1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i+1);

            if(Character.isLetter(first) && Character.isLetter(second)) { //문자인지 체크
                String str = Character.toString(first) + Character.toString(second);
                lst.add(str);
            }
        }
        return lst;
    }
}