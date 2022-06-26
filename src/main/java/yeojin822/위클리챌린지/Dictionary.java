package yeojin822.위클리챌린지;

import java.util.ArrayList;
import java.util.List;

/**
 * [84512] 모음사전
 */

public class Dictionary {
    //경우의 수로 풀기
/*    public int solution(String word) {
        int answer = word.length();
    *//*
        ["A", "E", "I", "O", "U"]  => 5개
         word.length 1,2,3,4,5
         경우의 수 = 5 + 25 + 125 + 625 + 3125 = 3905
         문자간의 거리 = 경우의 수 총합 / 문자열 길이의 경우의 수
     *//*
        int[] dist = new int[]{781, 156, 31, 6, 1};
        String dict = "AEIOU";
        for (int i = 0; i < word.length() ; i++) {
            int idx = dict.indexOf(word.charAt(i));
            answer += dist[i] * idx;
        }
        return answer;
    }*/

    // DFS로 풀기
        List<String> list = new ArrayList();
        public void dfs(String str, int n){
            if(n > 5) return;
            list.add(str);
            for(int i = 0; i < 5; i++){
                dfs(str + "AEIOU".charAt(i), n + 1);
            }
        }
        public int solution(String word) {
        int answer = 0;
        dfs("", 0);
        answer = list.indexOf(word);
        return answer;
    }
}
