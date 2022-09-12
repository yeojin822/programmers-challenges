package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_KakaoDevMatching2021Test {
    private final static Solution_KakaoDevMatching2021 sk = new Solution_KakaoDevMatching2021();

    @Test
    void 행렬_테두리_회전하기() {
        //given
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};

        //when
        int[] result = sk.solution01(rows, columns, queries);

        //then
        assertArrayEquals(result, new int[]{8,10,25});
    }
}