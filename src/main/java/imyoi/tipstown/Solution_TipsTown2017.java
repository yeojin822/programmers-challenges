package imyoi.tipstown;

import java.util.Stack;

public class Solution_TipsTown2017 {

    /**
     * #12973 짝지어 제거하기
     * push() - 해당 item을 Stack top에 삽입
     * pop() - Stack top에 있는 item을 삭제하고 해당 item 반환
     * peek() - Stack top에 있는 item을 삭제하지 않고 해당 item 반환
     * @param s
     * @return 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수
     * */
    public int solution01(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); //같다면 제거(stack.peek()와 들어가려는 문자(c)
            }else stack.push(c);
        }
        return stack.isEmpty() ? 1 : 0;
    }
}