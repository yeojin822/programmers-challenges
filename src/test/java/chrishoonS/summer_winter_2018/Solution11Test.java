package chrishoonS.summer_winter_2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution11Test {

    @Test
    void solution() {
        Solution11 slt11 = new Solution11();
        assertEquals(slt11.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}), 2);
    }
}