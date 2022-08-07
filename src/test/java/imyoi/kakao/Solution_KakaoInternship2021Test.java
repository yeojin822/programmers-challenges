package imyoi.kakao;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution_KakaoInternship2021Test {
    private final static Solution_KakaoInternship2021 sk = new Solution_KakaoInternship2021();

    @Test
    void 거리두기_확인하기() {
        //given
        String[][] places = {{"POOOP","OXXOX","OPXPX","OOXOX","POXXP"}
                            ,{"POOPX","OXPXP","PXXXO","OXXXO","OOOPP"}
                            ,{"PXOPX","OXOXP","OXPOX","OXXOP","PXPOX"}
                            ,{"OOOXX","XOOOX","OOOXX","OXOOX","OOOOO"}
                            ,{"PXPXP","XPXPX","PXPXP","XPXPX","PXPXP"}};
        //when
        int[] result = sk.solution(places);
        System.out.println(">>>>> " + Arrays.toString(result));

        //then
        assertArrayEquals(result,new int[]{1,0,1,1,1});
    }
}