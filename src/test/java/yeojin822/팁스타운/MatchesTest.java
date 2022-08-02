package yeojin822.팁스타운;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatchesTest {
    Matches matches = new Matches();
    @Test
    void solution() {
        assertThat(matches.solution(8,4,7)).isEqualTo(3);
    }
}
