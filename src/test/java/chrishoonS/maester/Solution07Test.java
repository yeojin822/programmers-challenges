package chrishoonS.maester;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution07Test {

    @Test
    void solution() {
        Solution07 slt07 = new Solution07();
        assertEquals(slt07.solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}),11);
        assertEquals(slt07.solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}}),-1);
    }
}