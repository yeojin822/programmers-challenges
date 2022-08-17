package chrishoonS.kakao2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution27Test {

    @Test
    void solution() {
        Solution27 slt27 = new Solution27();
        assertEquals(slt27.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}), 50);
        assertEquals(slt27.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}), 21);
        assertEquals(slt27.solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}), 60);
        assertEquals(slt27.solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}), 52);
        assertEquals(slt27.solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"}), 16);
        assertEquals(slt27.solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}), 25);
    }
}