package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoInternship2020Test {
    private static final Solution_KakaoInternship2020 sk = new Solution_KakaoInternship2020();

    @Test
    void 수식_최대화() {
        //given
        String expression = "100-200*300-500+20";

        //when
        long result = sk.solution(expression);
        System.out.println(result);

        //then
        assertEquals(60420, 60420);
    }
}