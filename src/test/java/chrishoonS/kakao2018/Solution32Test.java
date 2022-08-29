package chrishoonS.kakao2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void solution() {
        Solution32 slt32 = new Solution32();
        assertEquals(slt32.solution(2,4,2,1), "0111");
        assertEquals(slt32.solution(16,16,2,1), "02468ACE11111111");
        assertEquals(slt32.solution(16,16,2,2), "13579BDF01234567");
    }
}