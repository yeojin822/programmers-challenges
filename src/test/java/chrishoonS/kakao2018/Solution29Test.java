package chrishoonS.kakao2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void solution() {
        Solution29 slt29 = new Solution29();
        assertArrayEquals(slt29.solution("KAKAO"), new int[]{11, 1, 27, 15});
        assertArrayEquals(slt29.solution("TOBEORNOTTOBEORTOBEORNOT"), new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34});
        assertArrayEquals(slt29.solution("ABABABABABABABAB"), new int[]{1, 2, 27, 29, 28, 31, 30});
    }
}