package chrishoonS.weekly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution04Test {

    @Test
    void solution() {
        Solution04 slt04 = new Solution04();
        assertEquals(slt04.solution("AAAAE"),6);
        assertEquals(slt04.solution("AA"),2);
        assertEquals(slt04.solution("AAAE"),10);
        assertEquals(slt04.solution("I"),1563);
        assertEquals(slt04.solution("EIO"),1189);
    }
}