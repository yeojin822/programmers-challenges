package chrishoonS.kakao2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution36Test {

    @Test
    void solution() {
        Solution36 slt36 = new Solution36();
        assertEquals(slt36.solution("(()())()"), "(()())()");
        assertEquals(slt36.solution(")("), "()");
        assertEquals(slt36.solution("()))((()"), "()(())()");
    }
}