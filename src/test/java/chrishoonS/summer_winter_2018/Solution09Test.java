package chrishoonS.summer_winter_2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution09Test {

    @Test
    void solution() {
        Solution09 slt09 = new Solution09();
        assertArrayEquals(slt09.solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}),new int[] {3,3});
        assertArrayEquals(slt09.solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}),new int[] {0,0});
        assertArrayEquals(slt09.solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"}),new int[] {1,3});
    }
}