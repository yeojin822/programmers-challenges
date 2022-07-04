package chrishoonS.tips;

import java.util.Stack;

class Solution05 {
    public int solution(String s){
        int answer = 0;
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            if (!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}