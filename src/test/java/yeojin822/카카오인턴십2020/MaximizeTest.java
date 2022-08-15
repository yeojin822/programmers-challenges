package yeojin822.카카오인턴십2020;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximizeTest {
    Maximize maximize = new Maximize();
    @Test
    void solution() {
        assertThat(maximize.solution("100-200*300-500+20")).isEqualTo(60420);
        assertThat(maximize.solution("50*6-3*2")).isEqualTo(300);
    }
}
