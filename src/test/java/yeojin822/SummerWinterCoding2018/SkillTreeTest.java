package yeojin822.SummerWinterCoding2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SkillTreeTest {
    SkillTree skillTree = new SkillTree();
    @Test
    void solution() {
       // assertThat(skillTree.solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"})).isEqualTo(2);
       // assertThat(skillTree.solution("CBD",new String[]{"CAD"})).isEqualTo(0);
       // assertThat(skillTree.solution("CBD",new String[]{"AEF", "ZJW"})).isEqualTo(2);
       // assertThat(skillTree.solution("REA",new String[]{"REA", "POA"})).isEqualTo(1);
       // assertThat(skillTree.solution("CBDK",new String[]{"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"})).isEqualTo(4);
       // assertThat(skillTree.solution("BDC",new String[]{"AAAABACA"})).isEqualTo(0);
        assertThat(skillTree.solution("CBD",new String[]{"C", "D", "CB", "BDA"})).isEqualTo(2);

    }
}