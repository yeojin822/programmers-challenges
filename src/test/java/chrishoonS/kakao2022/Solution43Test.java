package chrishoonS.kakao2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {

    @Test
    void solution() {
        Solution43 slt43 = new Solution43();
        assertEquals(slt43.solution(new int[]{3,2,7,2}, new int[]{4,6,5,1}), 2);
        assertEquals(slt43.solution(new int[]{1,2,1,2}, new int[]{1,10,1,2}), 7);
        assertEquals(slt43.solution(new int[]{1,1}, new int[]{1,5}), -1);
    }
}