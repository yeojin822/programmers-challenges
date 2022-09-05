package yeojin822.KAKAOBLINDRECRUITMENT2020;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {
    StringCompression stringCompression = new StringCompression();
    @Test
    void solution() {
        assertThat(stringCompression.solution("aabbaccc")).isEqualTo(7);
        assertThat(stringCompression.solution("ababcdcdababcdcd")).isEqualTo(9);
        assertThat(stringCompression.solution("abcabcdede")).isEqualTo(8);
        assertThat(stringCompression.solution("abcabcabcabcdededededede")).isEqualTo(14);
        assertThat(stringCompression.solution("xababcdcdababcdcd")).isEqualTo(17);
    }
}
