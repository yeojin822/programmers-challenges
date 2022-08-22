package chrishoonS.kakao2018;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution30Test {

    @Test
    void solution() {
        Solution30 slt30 = new Solution30();
        assertArrayEquals(slt30.solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"}), new String[]{"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"});
    }
}