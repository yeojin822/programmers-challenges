package chrishoonS.kakao2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution39Test {

    @Test
    void solution() {
        Solution39 slt39 = new Solution39();
        assertArrayEquals(slt39.solution(6,6, new int[][]{{2,2,5,4},{3,3,6,6},{5,1,6,3}}) ,new int[]{8, 10, 25});
        assertArrayEquals(slt39.solution(3,3, new int[][]{{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}}) ,new int[]{1, 1, 5, 3});
        assertArrayEquals(slt39.solution(100,97, new int[][]{{1,1,100,97}}) ,new int[]{1});
    }
}