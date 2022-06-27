package yeojin822.위클리챌린지;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MakeStarTest {
    MakeStar makeStar = new MakeStar();
    @Test
    void solution() {
        assertThat(makeStar.solution(new int[][]{{2, -1, 4},{-2, -1, 4},{0, -1, 1},{5, -8, -12},{5, 8, 12}})).isEqualTo(new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"});
        assertThat(makeStar.solution(new int[][]{{0, 1, -1},{1, 0, -1},{1, 0, 1}})).isEqualTo(new String[]{"*.*"});
        assertThat(makeStar.solution(new int[][]{{1, -1, 0},{2, -1, 0}})).isEqualTo(new String[]{"*"});
        assertThat(makeStar.solution(new int[][]{{1, -1, 0},{2, -1, 0},{4, -1, 0}})).isEqualTo(new String[]{"*"});
    }
}
