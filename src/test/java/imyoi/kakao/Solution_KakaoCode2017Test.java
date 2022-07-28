package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoCode2017Test {
    private final static Solution_KakaoCode2017 sk = new Solution_KakaoCode2017();

    @Test
    void 단체사진_찍기() {
        //given
        int n = 2;
        String[] data = {"N~F=0", "R~T>2"};

        //when
        int result = sk.solution(n, data);

        //then
        assertEquals(result, 3648);
    }
}