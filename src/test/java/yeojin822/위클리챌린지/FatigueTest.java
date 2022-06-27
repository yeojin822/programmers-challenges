package yeojin822.위클리챌린지;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FatigueTest {
    Fatigue fatigue = new Fatigue();

    @Test
    void solution() {
     assertThat(fatigue.solution(80,new int[][]{{80,20},{50,40},{30,10}})).isEqualTo(3);
    }
}
