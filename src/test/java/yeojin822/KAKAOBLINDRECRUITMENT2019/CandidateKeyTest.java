package yeojin822.KAKAOBLINDRECRUITMENT2019;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CandidateKeyTest {
    CandidateKey candidateKey = new CandidateKey();
    @Test
    void solution() {
        assertThat(candidateKey.solution(new String[][]{{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}})).isEqualTo(2);
    }
}
