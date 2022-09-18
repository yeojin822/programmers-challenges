package yeojin822.KAKAOBLINDRECRUITMENT2022;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArcheryTest {
    Archery archery = new Archery();
    @Test
    void solution() {
        assertThat(archery.solution(5,new int[]{2,1,1,1,0,0,0,0,0,0,0})).isEqualTo(new int[]{0,2,2,0,1,0,0,0,0,0,0});
        assertThat(archery.solution(1,new int[]{1,0,0,0,0,0,0,0,0,0,0})).isEqualTo(new int[]{-1});
        assertThat(archery.solution(9,new int[]{0,0,1,2,0,1,1,1,1,1,1})).isEqualTo(new int[]{1,1,2,0,1,2,2,0,0,0,0});
        assertThat(archery.solution(10,new int[]{0,0,0,0,0,0,0,0,3,4,3})).isEqualTo(new int[]{1,1,1,1,1,1,1,1,0,0,2});
    }
}