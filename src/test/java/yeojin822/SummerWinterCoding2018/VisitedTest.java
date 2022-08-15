package yeojin822.SummerWinterCoding2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VisitedTest {
    Visited visited = new Visited();
    @Test
    void solution() {
        assertThat(visited.solution("ULURRDLLU")).isEqualTo(7);
        assertThat(visited.solution("LULLLLLLU")).isEqualTo(7);
        assertThat(visited.solution("UDU")).isEqualTo(1);
        assertThat(visited.solution("LRLRL")).isEqualTo(1);
        assertThat(visited.solution("LLLLRLRLRLL")).isEqualTo(5);
        assertThat(visited.solution("UUUUDUDUDUUU")).isEqualTo(5);


    }
}
