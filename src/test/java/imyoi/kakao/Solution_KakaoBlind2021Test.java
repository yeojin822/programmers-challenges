package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_KakaoBlind2021Test {
    private final static Solution_KakaoBlind2021 sk = new Solution_KakaoBlind2021();

    @Test
    void 메뉴_리뉴얼() {
        //given
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] courses = {2,3,4};

        //when
        String[] result = sk.solution01(orders,courses);

        //then
        assertArrayEquals(result, new String[]{"AC", "ACDE", "BCFG", "CDE"});
    }
}