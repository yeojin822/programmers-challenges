package chrishoonS.kakao2021;

import chrishoonS.kakao2019.Solution22;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution22Test {

    @Test
    void solution() {
        Solution22 slt22 = new Solution22();
        assertArrayEquals(slt22.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"), new int[] {2, 1, 3, 4});
        assertArrayEquals(slt22.solution("{{20,111},{111}}"), new int[] {111, 20});
        assertArrayEquals(slt22.solution("{{123}}"), new int[]{123});
        assertArrayEquals(slt22.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"), new int[]{3, 2, 4, 1});
    }
}