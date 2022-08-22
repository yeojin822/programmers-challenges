package imyoi.kakao;

import java.util.*;

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

    /*--------------------------------------------------------------------------------------------------------------*/
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

    /*--------------------------------------------------------------------------------------------------------------*/
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

    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * #17686 파일명 정렬
     * @param files : 1000 개 이하의 파일명을 포함하는 문자열 배열
     * @return 주어진 기준에 따라 정렬
     * */
    public String[] solution04(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                //1. HEAD 부분 비교 (대소문자 구분 안함)
                String head1 = s1.split("[0-9]")[0].toLowerCase();
                String head2 = s2.split("[0-9]")[0].toLowerCase();
                int result = head1.compareTo(head2);

                //2. 같을 경우 NUMBER(숫자) 부분 비교
                if (result == 0) {
                    //문자1 > 문자2 인 경우 두 값의 차는 양수, 문자1 < 문자2 인 경우 음수로 판단
                    result = getNumber(s1, head1) - getNumber(s2, head2);
                }

                //0이 아닌 다른 것을 반환하면 Comparator가 수행됨
                return result;
            }
        });
        return files;
    }

    public int getNumber(String s, String head) {
        String result = "";
        char[] cArr = s.substring(head.length()).toCharArray();
        for(char c : cArr) {
            //해당 값이 숫자인지 판별하고 숫자인 경우끼리 합침
            if(Character.isDigit(c) && result.length() < 5) {
                result += c;
            }
        }
        //만들어진 문자열은 정수형태로 변환 후 리턴
        return Integer.parseInt(result);
    }

    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * #17684 압축
     * @param msg : 영문 대문자로만 이뤄진 문자열
     * @return 주어진 문자열을 압축한 후의 사전 색인 번호를 배열로 출력하라.
     * */
    public int[] solution05(String msg) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int idx = 27;

        for(int i=0; i<idx; i++) {
            map.put(String.valueOf((char)('A'+i)), i+1); //사전 초기화
        }

        for(int i=0; i<msg.length(); i++) {
            String w = "";
            //현재 단어가 사전에 포함된 단어인지 체크
            while(i < msg.length() && map.containsKey(w+msg.charAt(i))) {
                w += msg.charAt(i);
                i++;
            }
            list.add(map.get(w)); //현재 단어(w)의 색인번호 결과리스트에 추가
            if(i < msg.length()) { //마지막 인덱스가 아니라면
                map.put(w+msg.charAt(i), idx); //사전에 추가 (w+c)
                idx++;
                i--;
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }

    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * #17683 방금그곡
     * @param m : 네오가 기억한 멜로디를 담은 문자열
     * @param musicinfos : 방송된 곡의 정보를 담고 있는 배열
     * @return 조건과 일치하는 음악 제목을 출력한다.
     * */
    public String solution06(String m, String[] musicinfos) {
        int maxtime = 0;
        String answer = "(None)"; //조건이 일치하는 음악이 없을 경우 None 반환
        m = convert(m); //기억한 멜로디에서 #이 포함된 문자는 소문자로 변환

        for(int i = 0; i< musicinfos.length;i++) {
            String[] tmp = musicinfos[i].split(",");
            tmp[3] = convert(tmp[3]); //곡 정보 중 악보정보에서 #이 포함된 문자는 소문자로 변환

            //runningTime 계산 (종료시간 - 시작시간)
            String[] startTime = tmp[0].split(":"); //시작시간
            String[] endTime = tmp[1].split(":");   //종료시간
            int hour = Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0]);
            int min = Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]) + (hour * 60);
            StringBuilder sb = new StringBuilder(); // 재싱시간동안 재생된 전체멜로디
            for(int j = 0; j<min;j++){
                //음악 재생시간동안 만들어지는 음을 문자열로 만듬
                sb.append(tmp[3].charAt(j % tmp[3].length()));
            }

            if(sb.toString().contains(m)){ //기억하는 음이 만들어진 문자열에 있고
                if(maxtime < sb.toString().length()){
                    maxtime = sb.toString().length();
                    answer = tmp[2]; //현재 노래제목을 넣어줌
                }
            }
        }
        return answer;
    }

    private String convert(String m) {
        //#가 포함된 문자인경우 구분하기 쉽도록 소문자로 변환해준다
        m = m.replace("A#","a");
        m = m.replace("C#","c");
        m = m.replace("D#","d");
        m = m.replace("F#","f");
        m = m.replace("G#","g");
        m = m.replace("E#","e");
        return m;
    }
}