package yeojin822.SummerWinterCoding2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JumpTeleportationTest {
    JumpTeleportation jumpTeleportation = new JumpTeleportation();
    @Test
    void solution() {
        assertThat(jumpTeleportation.solution(5)).isEqualTo(2);
        assertThat(jumpTeleportation.solution(6)).isEqualTo(2);
        assertThat(jumpTeleportation.solution(5000)).isEqualTo(5);
    }
}