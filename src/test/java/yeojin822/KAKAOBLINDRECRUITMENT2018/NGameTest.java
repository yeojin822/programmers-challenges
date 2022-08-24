package yeojin822.KAKAOBLINDRECRUITMENT2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NGameTest {
    NGame nGame = new NGame();
    @Test
    void solution() {
        assertThat(nGame.solution(2,4,2,1)).isEqualTo("0111");
        assertThat(nGame.solution(16,16,2,1)).isEqualTo("02468ACE11111111");
        assertThat(nGame.solution(16,16,2,2)).isEqualTo("13579BDF01234567");
    }
}
