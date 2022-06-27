package chrishoonS.weekly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution02Test {

    @Test
    void solution() {
        Solution02 slt02 = new Solution02();
        assertEquals(slt02.solution(new int[][]{{2, -1, 4},{-2, -1, 4},{0, -1, 1},{5, -8, -12},{5, 8, 12}}),new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"});
        assertEquals(slt02.solution(new int[][]{{0, 1, -1},{1, 0, -1},{1, 0, 1}}),new String[]{"*.*"});
        assertArrayEquals(slt02.solution(new int[][]{{1, -1, 0},{2, -1, 0}}), new String[]{"*"});
        assertEquals(slt02.solution(new int[][]{{1, -1, 0},{2, -1, 0},{4, -1, 0}}),new String[]{"*"});
    }
}