package chrishoonS.weekly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution03Test {

    @Test
    void solution() {
        Solution03 slt03 = new Solution03();
        assertEquals(slt03.solution(9, new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}}),3);
        assertEquals(slt03.solution(4,new int[][]{{1,2},{2,3},{3,4}}), 0);
        assertEquals(slt03.solution(7, new int[][]{{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}} ), 1);
    }
}