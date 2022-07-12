package chrishoonS.summer_winter_2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12Test {

    @Test
    void solution() {
        Solution12 slt12 = new Solution12();
        assertEquals(slt12.solution("ULURRDLLU"), 7);
        assertEquals(slt12.solution("LULLLLLLU"), 7);
    }
}