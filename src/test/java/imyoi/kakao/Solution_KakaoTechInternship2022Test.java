package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_KakaoTechInternship2022Test {

    private final static Solution_KakaoTechInternship2022 sk = new Solution_KakaoTechInternship2022();

    @Test
    void 두_큐의_합_같게_만들기() {
        int[] queue1 = {3,2,7,2};
        int[] queue2 = {4,6,5,1};

        int result = sk.solution(queue1, queue2);

        assertEquals(result, 2);
    }
}