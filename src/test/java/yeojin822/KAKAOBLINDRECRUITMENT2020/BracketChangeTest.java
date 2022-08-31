package yeojin822.KAKAOBLINDRECRUITMENT2020;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class BracketChangeTest {
    BracketChange bracketChange = new BracketChange();
    @Test
    void solution() {
        assertThat(bracketChange.solution("(()())()")).isEqualTo("(()())()");
        assertThat(bracketChange.solution(")(")).isEqualTo("()");
        assertThat(bracketChange.solution("()))((()")).isEqualTo("()(())()");
    }
}
