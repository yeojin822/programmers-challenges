package chrishoonS.summer_winter_2018;

import java.util.ArrayList;
import java.util.List;

class Solution09 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        boolean chkValid = true;

        for (int i = 0; i < words.length; i++) {
            if(list.contains(words[i])){
                chkValid = isChkValid(n, answer, i);
                break;
            }
            list.add(words[i]);

            //첫단어 제외 & 이전 끝단어 != 현재끝단어
            if(i>0 && (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))){
                chkValid = isChkValid(n, answer, i);
                break;
            }
        }
        if(chkValid)
            return new int[]{0,0};

        return answer;
    }

    private boolean isChkValid(int n, int[] answer, int i) {
        answer[0] = (i % n) + 1;
        answer[1] = (i / n) + 1;
        return false;
    }

}