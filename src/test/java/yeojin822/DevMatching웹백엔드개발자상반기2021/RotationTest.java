package yeojin822.DevMatching웹백엔드개발자상반기2021;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RotationTest {
    Rotation rotation = new Rotation();
    @Test
    void solution() {
        assertThat(rotation.solution(6,6,new int[][]{{2,2,5,4},{3,3,6,6},{5,1,6,3}})).isEqualTo(new int[]{8, 10, 25});
        assertThat(rotation.solution(3,3,new int[][]{{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}})).isEqualTo(new int[]{1, 1, 5, 3});
        assertThat(rotation.solution(100,97,new int[][]{{1,1,100,97}})).isEqualTo(new int[]{1});
    }
}



