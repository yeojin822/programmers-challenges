package imyoi.monthly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution_MonthlyChallenge3Test {
    private final static Solution_MonthlyChallenge3 sm = new Solution_MonthlyChallenge3();

    @Test
    void _n_2_배열_자르기() {
        //given
        int n = 3;
        long left = 2;
        long right = 5;

        //when
        int[] result = sm.solution(n, left, right);

        //then
        assertArrayEquals(result, new int[]{3,2,2,3});
    }
}