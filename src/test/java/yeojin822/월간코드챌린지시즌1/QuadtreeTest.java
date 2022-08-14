package yeojin822.월간코드챌린지시즌1;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QuadtreeTest {
    Quadtree quadtree = new Quadtree();
    @Test
    void solution() {
        assertThat(quadtree.solution(new int[][]{{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}})).isEqualTo(new int[]{4,9});
        assertThat(quadtree.solution(new int[][]{{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}})).isEqualTo(new int[]{10,15});
    }
}