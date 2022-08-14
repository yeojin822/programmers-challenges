package chrishoonS.monthCode2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution18Test {

    @Test
    void solution() {
        Solution18 slt18 = new Solution18();
        assertArrayEquals(slt18.solution(new long[]{2, 7}),new long[]{3, 11});
    }
}