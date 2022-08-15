package chrishoonS.monthCode2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution17Test {

    @Test
    void solution() {
        Solution17 slt17 = new Solution17();
        assertEquals(slt17.solution("[](){}"),3);
        assertEquals(slt17.solution("}]()[{"),2);
        assertEquals(slt17.solution("[)(]"),0);
        assertEquals(slt17.solution("}}}"),0);
    }
}