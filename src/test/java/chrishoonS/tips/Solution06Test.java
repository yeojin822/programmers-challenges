package chrishoonS.tips;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution06Test {

    @Test
    void solution() {
        Solution06 slt06 = new Solution06();
        assertEquals(slt06.solution(8,4,7),3);
    }
}