package chrishoonS.kakao2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void solution() {
        Solution35 slt35 = new Solution35();
        assertEquals(slt35.solution("aabbaccc"),7);
        assertEquals(slt35.solution("ababcdcdababcdcd"),9);
        assertEquals(slt35.solution("abcabcdede"),8);
        assertEquals(slt35.solution("abcabcabcabcdededededede"),14);
        assertEquals(slt35.solution("xababcdcdababcdcd"),17);
    }
}