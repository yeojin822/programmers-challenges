package yeojin822.월간코드챌린지시즌3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LightTest {
    Light light = new Light();
    @Test
    void solution() {
        assertThat(light.solution(new String[]{"SL","LR"})).isEqualTo(new int[]{16});
        assertThat(light.solution(new String[]{"S"})).isEqualTo(new int[]{1,1,1,1});
        assertThat(light.solution(new String[]{"R","R"})).isEqualTo(new int[]{4,4});
    }
}
