package chrishoonS.tips;

import chrishoonS.tips.Solution05;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution05Test {

    @Test
    void solution() {
        Solution05 slt05 = new Solution05();
        assertEquals(slt05.solution("baabaa"),1);
        assertEquals(slt05.solution("cdcd"),0);
    }
}