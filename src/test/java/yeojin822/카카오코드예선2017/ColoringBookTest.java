package yeojin822.카카오코드예선2017;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ColoringBookTest {
    ColoringBook coloringBook = new ColoringBook();
    @Test
    void solution() {
        assertThat(coloringBook.solution(6,4,new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}})).isEqualTo(new int[]{4,5});
    }
}