package yeojin822.팁스타운;

import java.util.Stack;

/**
 * [12973] 짝지어 제거하기
 */
public class PairRemove {
    public int solution(String s) {
        int answer = -1;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                //값이 비어있다면 추가
                stack.push(s.charAt(i));
            } else {
                //값을 꺼내와서 비교
                if (stack.peek() == s.charAt(i)) {
                    //같으면 제거
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        answer = stack.size() == 0 ? 1 : 0;
        return answer;
    }
}
