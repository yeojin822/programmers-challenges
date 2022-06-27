package yeojin822.팁스타운;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PairRemoveTest {
    PairRemove pairRemove = new PairRemove();
    @Test
    void solution() {
        assertThat(pairRemove.solution("baabaa")).isEqualTo(1);
        assertThat(pairRemove.solution("cdcd")).isEqualTo(0);
    }
}
