package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_KakaoBlind2020Test {
    private final static Solution_KakaoBlind2020 sk = new Solution_KakaoBlind2020();

    @Test
    void 문자열압축() {
        //given
        String s = "aabbaccc";

        //when
        int result = sk.solution01(s);

        //then
        assertEquals(result, 7);
    }
}