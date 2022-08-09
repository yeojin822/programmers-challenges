package yeojin822.KAKAOBLINDRECRUITMENT2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClusteringTest {
    Clustering clustering = new Clustering();
    @Test
    void solution() {
        assertThat(clustering.solution("FRANCE","french")).isEqualTo(16384);
        assertThat(clustering.solution("handshake","shake hands")).isEqualTo(65536);
        assertThat(clustering.solution("aa1+aa2","AAAA12")).isEqualTo(43690);
        assertThat(clustering.solution("E=M*C^2","e=m*c^2")).isEqualTo(65536);
    }
}