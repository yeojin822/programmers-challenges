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

    @Test
    void 순위_검색() {
        //given
        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

        //when
        //int[] result = {1,1,1,1,2,4};
        int[] result = sk.solution02(info, query);

        //then
        assertArrayEquals(result, new int[]{1,1,1,1,2,4});
    }
}