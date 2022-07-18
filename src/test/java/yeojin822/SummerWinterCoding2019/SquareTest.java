package yeojin822.SummerWinterCoding2019;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square();
    @Test
    void solution() {
        assertThat(square.solution(8,12)).isEqualTo(80);
    }
}
