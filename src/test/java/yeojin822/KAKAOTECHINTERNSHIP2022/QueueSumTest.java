package yeojin822.KAKAOTECHINTERNSHIP2022;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QueueSumTest {
    QueueSum queueSum = new QueueSum();
    @Test
    void solution() {
        assertThat(queueSum.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1})).isEqualTo(2);
        assertThat(queueSum.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2})).isEqualTo(7);
        assertThat(queueSum.solution(new int[]{1, 1}, new int[]{1, 5})).isEqualTo(-1);
    }
}
