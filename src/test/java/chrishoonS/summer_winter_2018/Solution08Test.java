package chrishoonS.summer_winter_2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution08Test {

    @Test
    void solution() {
        Solution08 slt08 = new Solution08();
        assertEquals(slt08.solution(5, new int[][] {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}}, 3),4);
        assertEquals(slt08.solution(5, new int[][] {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}}, 4),4);
    }
}