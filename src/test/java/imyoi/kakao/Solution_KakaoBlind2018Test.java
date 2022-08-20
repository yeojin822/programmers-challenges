package imyoi.kakao;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    @Test
    void 캐시() {
        //given
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        //when
        int result = sk.solution02(cacheSize, cities);

        //then
        assertEquals(result, 50);
    }

    /*
     * 첫 번째에는 A 블록 6개가 지워지고,
     * 두 번째에는 B 블록 4개와 C 블록 4개가 지워져,
     * 모두 14개의 블록이 지워진다.
     *
     * [첫 번째]
     * => A: 6개
     * CCBDE
     * AAADE
     * AAABF
     * CCBBF
     *
     * [두 번째]
     * => B: 4개 / C: 4개
     *    DE
     *    DE
     * CCBBF
     * CCBBF
     *
     * */
    @Test
    void 프렌즈_4블록() {
        //given
        int m = 4;
        int n = 5;
        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};

        //when
        int result = sk.solution03(m, n, board);

        //then
        assertEquals(result, 14);
    }

    @Test
    void 파일명_정렬() {
        //given
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        //when
        String[] result = sk.solution04(files);

        //then
        assertArrayEquals(result, new String[]{"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"});
    }
}