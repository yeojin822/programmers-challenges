package yeojin822.KAKAOBLINDRECRUITMENT2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SongTest {
    Song song = new Song();
    @Test
    void solution() {
        assertThat(song.solution("ABCDEFG",new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"})).isEqualTo("HELLO");
        assertThat(song.solution("CC#BCC#BCC#BCC#B",new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"})).isEqualTo("FOO");
        assertThat(song.solution("ABC",new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"})).isEqualTo("WORLD");
    }
}
