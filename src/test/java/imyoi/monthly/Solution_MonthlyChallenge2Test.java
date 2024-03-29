package imyoi.monthly;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution_MonthlyChallenge2Test {
    private final static Solution_MonthlyChallenge2 sm = new Solution_MonthlyChallenge2();

    @Test
    void 괄호_회전하기() {
        //given
        String s = "[](){}";

        //when
        int result = sm.solution01(s);

        //then
        assertEquals(result,3);
    }

    @Test
    void _2개_이하로_다른_비트() {
        //given
        long[] numbers = {2, 7};

        //when
        long[] result = sm.solution02(numbers);

        //then
        assertArrayEquals(result, new long[]{3, 11});
    }
}
