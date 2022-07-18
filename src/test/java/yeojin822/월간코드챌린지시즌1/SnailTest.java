package yeojin822.월간코드챌린지시즌1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SnailTest {
    Snail snail = new Snail();
    @Test
    void solution() {
        assertThat(snail.solution(4)).isEqualTo(new int[]{1,2,9,3,10,8,4,5,6,7});
        assertThat(snail.solution(5)).isEqualTo(new int[]{1,2,12,3,13,11,4,14,15,10,5,6,7,8,9});
        assertThat(snail.solution(6)).isEqualTo(new int[]{1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11});
    }
}