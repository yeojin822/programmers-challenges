package chrishoonS.kakao2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution37Test {

    @Test
    void solution() {
        Solution37 slt37 = new Solution37();
        assertArrayEquals(slt37.solution(new String[] {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[] {2,3,4}), new String[]{"AC", "ACDE", "BCFG", "CDE"});
        assertArrayEquals(slt37.solution(new String[] {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[] {2,3,5}), new String[]{"ACD", "AD", "ADE", "CD", "XYZ"});
        assertArrayEquals(slt37.solution(new String[] {"XYZ", "XWY", "WXA"}, new int[] {2,3,4}), new String[]{"WX", "XY"});
    }
}