package chrishoonS.kakao2017;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution20Test {

    @Test
    void solution() {
        Solution20 slt20 = new Solution20();
        assertArrayEquals(slt20.solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}}), new int[]{4, 5});
    }
}