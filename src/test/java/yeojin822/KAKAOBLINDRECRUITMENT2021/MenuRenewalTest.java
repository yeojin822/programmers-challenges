package yeojin822.KAKAOBLINDRECRUITMENT2021;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MenuRenewalTest {
    MenuRenewal menuRenewal = new MenuRenewal();
    @Test
    void solution() {
        assertThat(menuRenewal.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2,3,4})).isEqualTo(new String[]{"AC", "ACDE", "BCFG", "CDE"});
        assertThat(menuRenewal.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2,3,5})).isEqualTo(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"});
        assertThat(menuRenewal.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2,3,4})).isEqualTo(new String[]{"WX", "XY"});
    }
}
