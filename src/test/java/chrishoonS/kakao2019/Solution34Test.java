package chrishoonS.kakao2019;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void solution() {
        Solution34 slt34 = new Solution34();
        assertEquals(slt34.solution(new String[][]{{"100","ryan","music","2"},
                {"200","apeach","math","2"},
                {"300","tube","computer","3"},
                {"400","con","computer","4"},
                {"500","muzi","music","3"},
                {"600","apeach","music","2"}}),2);
    }
}