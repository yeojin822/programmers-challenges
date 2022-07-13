package chrishoonS.summer_winter_2019;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution13Test {

    @Test
    void solution() {
        Solution13 slt13 = new Solution13();
        assertEquals(slt13.solution(8,12), 80);
    }
}