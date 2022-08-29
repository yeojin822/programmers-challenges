package chrishoonS.monthCode3;

import chrishoonS.kakao2018.Solution28;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void solution() {
        Solution31 slt31 = new Solution31();
        assertArrayEquals(slt31.solution(new String[]{"SL","LR"}), new int[]{16});
        assertArrayEquals(slt31.solution(new String[]{"S"}), new int[]{1,1,1,1});
        assertArrayEquals(slt31.solution(new String[]{"R","R"}), new int[]{4,4});
    }
}