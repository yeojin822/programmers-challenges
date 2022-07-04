package imyoi.swCoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_SummerWinter2018Test {
    private final static Solution_SummerWinter2018 ss = new Solution_SummerWinter2018();

    @Test
    void 배달() {
        //given
        int N = 5;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        int K = 3;

        //when
        int result = ss.solution01(N, road, K);

        //then
        assertEquals(result,4);
    }
}