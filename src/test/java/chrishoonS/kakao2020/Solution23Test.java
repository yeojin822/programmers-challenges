package chrishoonS.kakao2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution23Test {

    @Test
    void solution() {
        Solution23 slt23 = new Solution23();
        assertEquals(slt23.solution("100-200*300-500+20"), 60420);
        assertEquals(slt23.solution("50*6-3*2"), 300);
    }
}