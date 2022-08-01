package imyoi.kakao;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution_KakaoInternship2019Test {
    private final static Solution_KakaoInternship2019 sk = new Solution_KakaoInternship2019();

    @Test
    void solution() {
        //given
        String s = "{{20,111},{111}}";

        //when
        int[] result = sk.solution(s);
        System.out.println("result >>>> " + Arrays.toString(result));

        //then
        assertArrayEquals(result, new int[]{111,20});
    }
}