package yeojin822.SummerWinterCoding2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordRelayTest {
    WordRelay wordRelay = new WordRelay();
    @Test
    void solution() {
       assertThat(wordRelay.solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})).isEqualTo(new int[]{3,3});
       assertThat(wordRelay.solution(2,new String[]{"land", "dream", "mom", "mom", "ror"})).isEqualTo(new int[]{2,2});
       assertThat(wordRelay.solution(2,new String[]{"land", "dream", "mom", "mom"})).isEqualTo(new int[]{2,2});
       assertThat(wordRelay.solution(5,new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})).isEqualTo(new int[]{0,0});
       assertThat(wordRelay.solution(2,new String[]{"hello", "one", "even", "never", "now", "world", "draw"})).isEqualTo(new int[]{1,3});
    }
}
