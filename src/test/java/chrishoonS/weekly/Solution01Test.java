package chrishoonS.weekly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution01Test {

    @Test
    void solution() {
        Solution01 slt01 = new Solution01();
        assertEquals(slt01.solution(80,new int[][]{{80,20},{50,40},{30,10}}),3);
    }
}