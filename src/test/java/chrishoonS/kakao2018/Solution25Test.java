package chrishoonS.kakao2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution25Test {

    @Test
    void solution() {
        Solution25 slt25 = new Solution25();
        assertEquals(slt25.solution("FRANCE", "french"), 16384);
        assertEquals(slt25.solution("handshake", "shake hands"), 65536);
        assertEquals(slt25.solution("aa1+aa2", "AAAA12"), 43690);
        assertEquals(slt25.solution("E=M*C^2", "e=m*c^2"), 65536);
    }
}