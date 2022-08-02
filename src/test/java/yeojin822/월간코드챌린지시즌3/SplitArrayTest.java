package yeojin822.월간코드챌린지시즌3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SplitArrayTest {
    SplitArray splitArray = new SplitArray();
    @Test
    void solution() {
        assertThat(splitArray.solution(3,2,5)).isEqualTo(new int[]{3,2,2,3});
        assertThat(splitArray.solution(4,7,14)).isEqualTo(new int[]{4,3,3,3,4,4,4,4});
    }
}
