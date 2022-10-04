package yeojin822.코딩테스트고득점Kit.해시;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CallNumberTest {
    CallNumber callNumber = new CallNumber();
    @Test
    void solution() {
        assertThat(callNumber.solution(new String[]{"119", "97674223", "1195524421"})).isEqualTo(false);
        assertThat(callNumber.solution(new String[]{"123","456","789"})).isEqualTo(true);
        assertThat(callNumber.solution(new String[]{"12","123","1235","567","88"})).isEqualTo(false);
    }
}
