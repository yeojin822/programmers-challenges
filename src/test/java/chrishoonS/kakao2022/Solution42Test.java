package chrishoonS.kakao2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void solution() {
        Solution42 slt42 = new Solution42();

        assertArrayEquals(slt42.solution(5, new int[] {2,1,1,1,0,0,0,0,0,0,0}), new int[] {0,2,2,0,1,0,0,0,0,0,0});
        assertArrayEquals(slt42.solution(1, new int[] {1,0,0,0,0,0,0,0,0,0,0}), new int[] {-1});
        assertArrayEquals(slt42.solution(9, new int[] {0,0,1,2,0,1,1,1,1,1,1}), new int[] {1,1,2,0,1,2,2,0,0,0,0});
        assertArrayEquals(slt42.solution(10, new int[] {0,0,0,0,0,0,0,0,3,4,3}), new int[] {1,1,1,1,1,1,1,1,0,0,2});
    }
}