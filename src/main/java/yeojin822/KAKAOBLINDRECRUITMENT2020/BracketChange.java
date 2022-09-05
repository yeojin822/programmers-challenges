package yeojin822.KAKAOBLINDRECRUITMENT2020;

import java.util.Stack;

/**
 * [60058] 괄호 변환
 */
public class BracketChange {

    public String solution(String p) {
        String answer = dfs(p);
        return answer;
    }

    static String dfs(String str){
        int cnt=0,idx=0,len = str.length();
        String result = "";
        // 빈 문자열인 경우 빈 문자열 반환
        if(str.equals("")) return str;

        while(idx<len){
            char c = str.charAt(idx++);
            if(c=='(') cnt++;
            else cnt--;
            if(cnt==0) break;
        }
        //문자열 w를 균형잡힌 괄호 문자열 u,v로 분리
        String u = str.substring(0,idx);
        String v = str.substring(idx,len);

        //문쟈열 u가 올바른 괄호 문자열이라면 문자열 v에 대해 반복
        if(isCorrect(u)){
            result = u + dfs(v); // 수행한 결과 문자열을 u에 이어 붙인 후 반환
        }
        else{
            result = "("+dfs(v)+")";
            int ulen = u.length();
            for(int i=1;i<ulen-1;i++){
                char c = u.charAt(i);
                if(c=='(') result+=')';
                else result+='(';
            }
        }
        return result;
    }

    static boolean isCorrect(String str){
        Stack<Character> s = new Stack<>();
        int len = str.length();

        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            if(c=='(') s.add(c);
            else{
                if(s.isEmpty()) return false;
                else s.pop();
            }
        }
        return s.isEmpty();
    }


}
