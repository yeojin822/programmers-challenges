package yeojin822.카카오개발자겨울인턴십2019;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TupleTest {
    Tuple tuple = new Tuple();
    @Test
    void solution() {
        assertThat(tuple.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")).isEqualTo(new int[]{2, 1, 3, 4});
        assertThat(tuple.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")).isEqualTo(new int[]{2, 1, 3, 4});
    }
}
