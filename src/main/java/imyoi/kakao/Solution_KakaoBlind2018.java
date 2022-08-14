package imyoi.kakao;

import java.util.ArrayList;
import java.util.LinkedList;
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


    /**
     * #17680 캐시
     * - 캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다
     * -> 가장 오랫동안 참조되지 않은 페이지를 교체하는 기법
     * - cache hit일 경우 실행시간은 1이다.
     * - cache miss일 경우 실행시간은 5이다.
     * @param cacheSize
     * @param cities
     * @return 입력된 도시이름 배열을 순서대로 처리할 때, "총 실행시간"을 출력
     * */
    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;

    public int solution02(int cacheSize, String[] cities) {
        int answer = 0;

        LinkedList<String> cache = new LinkedList<>();

        //cacheSize가 0일때의 처리
        if(cacheSize == 0) return 5 * cities.length;

        for(int i = 0 ; i < cities.length ; ++i){
            String city = cities[i].toUpperCase();

            //리스트에서 삭제 후 다시 삽입
            if(cache.remove(city)){
                answer += CACHE_HIT;
                cache.add(city);
            } else {
                answer += CACHE_MISS;

                //다 찼을 경우 삭제 후 맨 처음꺼(index=0) 다시 삽입
                if(cache.size() == cacheSize){
                    cache.remove(0);
                }
                cache.add(city);
            }
        }
        return answer;
    }
}