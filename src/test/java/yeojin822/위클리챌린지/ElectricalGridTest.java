package yeojin822.위클리챌린지;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ElectricalGridTest {
    ElectricalGrid electricalGrid = new ElectricalGrid();
    @Test
    void solution() {
        assertThat(electricalGrid.solution(9,new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}})).isEqualTo(3);
//        assertThat(electricalGrid.solution(4,new int[][]{{1,2},{2,3},{3,4}})).isEqualTo(0);
       // assertThat(electricalGrid.solution(7,new int[][]{{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}})).isEqualTo(1);

    }
}
