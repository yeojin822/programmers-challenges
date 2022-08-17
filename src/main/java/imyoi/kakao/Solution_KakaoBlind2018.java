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


    /**
     * #17679 프렌즈 4블록
     * - 4x4 블록이 같을 경우 지워지는데, 4x4가 겹쳐있는 경우에도 모두 지워진다.
     * 1. 사라질 블록(4*4에 해당하는 블록) 체크
     * 2. 체크된 블록 제거
     * 3. 블록 내리기(=제거된 블록 자리 채우기)
     * 4. 더 이상 사라질 블록이 없을 때까지 반복 어떻게 해야할지는 이해 됨..ㅎ
     * @param m : 판의 높이
     * @param n : 판의 폭
     * @param board : 판의 배치 정보
     * @return
     * */
    public int solution03(int m, int n, String[] board) {
        int answer = 0;

        //변경을 쉽게 하기 위해 이중배열로 바꿈
        char[][] map = new char[m][n];
        for(int i = 0 ; i < m ; ++i) {
            map[i] = board[i].toCharArray();
        }

        //체크 → 제거 → 내리기 반복
        while(true) {
            int cnt = check(m, n, map);
            if(cnt == 0) break;
            answer += cnt;

            drop(m, n, map); //내리기
        }

        return answer;
    }

    private int check(int m, int n, char[][] map) {
        int cnt = 0;
        boolean[][] isChecked = new boolean[m][n];
        for(int i=0; i<m-1; ++i) {
            for(int j=0; j<n-1; ++j) {
                if(map[i][j] == '0') continue;
                checkFour(map, isChecked, i, j); //4*4 블록 체크
            }
        }
        for(int i=0; i<m; ++i) {
            for(int j=0; j<n; ++j) {
                if(isChecked[i][j]) {
                    cnt++;
                    map[i][j] = '0'; //빈칸으로 정의
                }
            }
        }

        return cnt;
    }

    private void checkFour(char[][] map, boolean[][] isChecked, int i, int j) {
        char block = map[i][j];
        for(int r = i ; r < i + 2 ; ++r) {
            for(int c = j ; c < j + 2 ; ++c) {
                if(map[r][c] != block) return;
            }
        }

        for(int r=i; r<i+2; ++r) {
            for(int c=j; c<j+2; ++c) {
                isChecked[r][c] = true; //4*4 맞음!
            }
        }
    }

    private void drop(int m, int n, char[][] map) {
        for(int c=0; c<n; ++c) {
            for(int r=m-1; r>=0; --r) {
                if(map[r][c] == '0') { //제거된 블록이라면
                    for(int nr=r-1; nr>=0; --nr) {
                        if(map[nr][c] != '0') {
                            map[r][c] = map[nr][c];
                            map[nr][c] = '0';
                            break;
                        }
                    }
                }
            }
        }
    }
}