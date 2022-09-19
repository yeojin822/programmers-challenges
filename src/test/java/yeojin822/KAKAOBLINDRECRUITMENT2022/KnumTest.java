package yeojin822.KAKAOBLINDRECRUITMENT2022;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class KnumTest {
    Knum knum = new Knum();
    @Test
    void solution() {
        assertThat(knum.solution(437674,3)).isEqualTo(3);
        assertThat(knum.solution(110011,10)).isEqualTo(2);
    }
}
