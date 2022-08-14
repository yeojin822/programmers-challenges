package yeojin822.월간코드챌린지시즌1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    Binary binary = new Binary();
    @Test
    void solution() {
        assertThat(binary.solution("110010101001")).isEqualTo(new int[]{3,8});
        assertThat(binary.solution("01110")).isEqualTo(new int[]{3,3});
        assertThat(binary.solution("1111111")).isEqualTo(new int[]{4,1});
    }
}