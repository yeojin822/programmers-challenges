package yeojin822.월간코드챌린지시즌2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BracketTest {
    Bracket bracket = new Bracket();
    @Test
    void solution() {
        assertThat(bracket.solution("[](){}")).isEqualTo(3);
        assertThat(bracket.solution("}]()[{")).isEqualTo(2);
        assertThat(bracket.solution("[)(]")).isEqualTo(0);
        assertThat(bracket.solution("}}}")).isEqualTo(0);
        assertThat(bracket.solution("{{{}")).isEqualTo(0);
    }
}