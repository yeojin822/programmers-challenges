package yeojin822.KAKAOBLINDRECRUITMENT2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BlockTest {
    Block block = new Block();
    @Test
    void solution() {
        assertThat(block.solution(4,5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"})).isEqualTo(14);
        assertThat(block.solution(6,6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"})).isEqualTo(15);
    }
}