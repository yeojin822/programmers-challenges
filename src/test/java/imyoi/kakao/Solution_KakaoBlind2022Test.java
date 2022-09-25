package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_KakaoBlind2022Test {
    private final static Solution_KakaoBlind2022 sk = new Solution_KakaoBlind2022();

    @Test
    void k진수에서_소수_개수_구하기() {
        //given
        int n = 437674;
        int k = 3;

        //when
        int result = sk.solution01(n, k);

        //then
        assertEquals(result, 3);
    }

    @Test
    void 주차_요금_계산() {
        //given
        int[] fees = {120,0,60,591};
        String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};

        //when
        int[] result = sk.solution02(fees, records);

        //then
        assertArrayEquals(result, new int[]{0,591});
    }

    @Test
    void 양궁대회() {
        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};

        int[] result = sk.solution03(n, info);

        assertArrayEquals(result, new int[]{0,2,2,0,1,0,0,0,0,0,0});
    }
}