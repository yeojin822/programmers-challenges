package chrishoonS.monthCode1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution15Test {

    @Test
    void solution() {
        Solution15 slt15 = new Solution15();
        assertArrayEquals(slt15.solution("110010101001"), new int[]{3,8});
        assertArrayEquals(slt15.solution("01110"), new int[]{3,3});
        assertArrayEquals(slt15.solution("1111111"), new int[]{4,1});
    }
}