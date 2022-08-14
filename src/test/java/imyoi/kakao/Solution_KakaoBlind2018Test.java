package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoBlind2018Test {
    private final static Solution_KakaoBlind2018 sk = new Solution_KakaoBlind2018();

    @Test
    void 뉴스_클러스터링() {
        //given
        String str1 = "FRANCE";
        String str2 = "french";

        //when
        int result = sk.solution01(str1, str2);

        //then
        assertEquals(result, 16384);
    }
}