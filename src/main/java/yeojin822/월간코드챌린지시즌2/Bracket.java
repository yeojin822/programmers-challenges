package yeojin822.월간코드챌린지시즌2;

import java.util.Stack;

/**
 * [76502] 괄호 회전하기
 */
public class Bracket {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer += (check(s)) ? 1 : 0;
            s = s.substring(1, s.length()) + s.substring(0,1); // 회전
        }
        return answer;
    }
    public static boolean check(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    char c = stack.pop();
                    if(c == '(' && str.charAt(i) == ')') { continue; }
                    if(c == '{' && str.charAt(i) == '}') { continue; }
                    if(c == '[' && str.charAt(i) == ']') { continue; }
                }
                return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
