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
}