package imyoi.kakao;

import java.util.HashMap;
import java.util.Map;

public class Solution_KakaoCode2017 {

    //각각 어피치, 콘, 프로도, 제이지, 무지, 네오, 라이언, 튜브를 의미
    String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    Map<String, Integer> temp = new HashMap<>();
    boolean[] visited = new boolean[8];
    String[] data;
    int n, answer = 0;

    /**
     * #1835 단체사진 찍기
     * @param n
     * @param data
     * @return 모든 조건을 만족하는 경우의 수
     * */
    public int solution(int n, String[] data) {
        this.n = n;
        this.data = data;
        dfs(0);
        return answer;
    }

    //DFS(깊이우선탐색)
    public void dfs(int idx) {
        if(idx == 8 && isCheck()) answer++;
        for(int i = 0; i < 8; i++) {
            //방문 체크
            if(!visited[i]) {
                visited[i] = true;
                temp.put(friends[i], idx);
                dfs(idx+1); //재귀
                visited[i] = false;
            }
        }
    }

    //조건에 만족하는지 체크
    public boolean isCheck() {
        for(int i = 0; i < n; i++) {
            int a = temp.get(data[i].substring(0, 1)); //조건을 제시한 프렌즈
            int b = temp.get(data[i].substring(2, 3)); //상대방
            String op = data[i].substring(3, 4); //연산자(=,<,>)

            int diff1 = Math.abs(a-b) - 1;
            int diff2 = Integer.parseInt(data[i].substring(4, 5));

            switch (op) { //연산자에 따라 분기처리
                case "=":
                    if(diff1 != diff2) return false;
                    break;
                case "<":
                    if(diff1 >= diff2) return false;
                    break;
                case ">":
                    if(diff1 <= diff2) return false;
                    break;
            }
        }
        return true;
    }
}