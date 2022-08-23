package chrishoonS.kakao2018;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void solution() {
        Solution28 slt28 = new Solution28();
        assertEquals(slt28.solution("ABCDEFG", new String[] {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"}), "HELLO");
        assertEquals(slt28.solution("CC#BCC#BCC#BCC#B", new String[] {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"}), "FOO");
        assertEquals(slt28.solution("ABC", new String[] {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"}), "WORLD");
    }
}