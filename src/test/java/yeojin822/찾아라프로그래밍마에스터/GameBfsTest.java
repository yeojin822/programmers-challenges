package yeojin822.찾아라프로그래밍마에스터;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameBfsTest {
    GameBfs gameBfs = new GameBfs();

    @Test
    void solution() {
        assertThat(gameBfs.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}})).isEqualTo(11);
    }
}
