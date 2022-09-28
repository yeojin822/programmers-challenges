package yeojin822.코딩테스트고득점Kit.해시;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DisguiseTest {
    Disguise disguise = new Disguise();
    @Test
    void solution() {
        assertThat(disguise.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}})).isEqualTo(5);
        assertThat(disguise.solution(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}})).isEqualTo(3);
    }
}
