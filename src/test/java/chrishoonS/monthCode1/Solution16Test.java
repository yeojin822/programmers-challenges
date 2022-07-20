package chrishoonS.monthCode1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution16Test {

    @Test
    void solution() {
        Solution16 slt16 = new Solution16();
        assertArrayEquals(slt16.solution(new int[][]{{1,1,0,0}, {1,0,0,0}, {1,0,0,1}, {1,1,1,1}}), new int[]{4,9});
        assertArrayEquals(slt16.solution(new int[][]{{1, 1, 1, 1, 1, 1, 1, 1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}}), new int[]{10,15});
    }
}