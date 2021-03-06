package imyoi.swCoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_SummerWinter2018Test {
    private final static Solution_SummerWinter2018 ss = new Solution_SummerWinter2018();

    @Test
    void 배달() {
        //given
        int N = 5;
        int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        int K = 3;

        //when
        int result = ss.solution01(N, road, K);

        //then
        assertEquals(result,4);
    }

    @Test
    void 영어_끝말잇기() {
        //given
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        //when
        int[] result = ss.solution02(n, words);

        //then
        assertArrayEquals(result, new int[]{1,3});
    }

    @Test
    void 점프와_순간_이동() {
        //given
        int N = 5;

        //when
        int result = ss.solution03(N);

        //then
        assertEquals(result, 2);
    }

    @Test
    void 스킬트리() {
        //given
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        //when
        int result = ss.solution04(skill, skill_trees);

        //then
        assertEquals(result, 2);
    }

    @Test
    void 방문길이() {
        //given
        String dirs = "LULLLLLLU";

        //when
        int result = ss.solution05(dirs);
        System.out.println(result);

        //then
        assertEquals(result, 7);
    }
}