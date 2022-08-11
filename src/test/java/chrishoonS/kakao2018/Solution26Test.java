package chrishoonS.kakao2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

    @Test
    void solution() {
        Solution26 slt26 = new Solution26();
        assertEquals(slt26.solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}), 14);
        assertEquals(slt26.solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}), 15);
    }
}