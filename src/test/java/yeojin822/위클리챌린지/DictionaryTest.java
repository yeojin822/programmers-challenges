package yeojin822.위클리챌린지;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    Dictionary dictionary = new Dictionary();
    @Test
    void solution() {
        assertThat(dictionary.solution("AAAAE")).isEqualTo(6);
        assertThat(dictionary.solution("AA")).isEqualTo(2);
        assertThat(dictionary.solution("AAAE")).isEqualTo(10);
        assertThat(dictionary.solution("I")).isEqualTo(1563);
        assertThat(dictionary.solution("EIO")).isEqualTo(1189);
    }
}