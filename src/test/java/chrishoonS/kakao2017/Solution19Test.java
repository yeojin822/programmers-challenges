package chrishoonS.kakao2017;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution19Test {

    @Test
    void solution() {
        Solution19 slt19 = new Solution19();
        assertEquals(slt19.solution(2, new String[]{"N~F=0", "R~T>2"}), 3648);
        assertEquals(slt19.solution(2, new String[]{"M~C<2", "C~M>1"}), 0);
    }
}