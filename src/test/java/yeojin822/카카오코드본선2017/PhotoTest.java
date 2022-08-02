package yeojin822.카카오코드본선2017;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PhotoTest {
    Photo photo = new Photo();
    @Test
    void solution() {
        assertThat(photo.solution(2,new String[]{"N~F=0", "R~T>2"})).isEqualTo(3648);
        assertThat(photo.solution(2,new String[]{"M~C<2", "C~M>1"})).isEqualTo(0);
    }
}
