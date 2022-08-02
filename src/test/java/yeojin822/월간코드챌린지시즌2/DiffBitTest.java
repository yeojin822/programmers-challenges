package yeojin822.월간코드챌린지시즌2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DiffBitTest {
    DiffBit diffBit = new DiffBit();
    @Test
    void solution() {
        assertThat(diffBit.solution(new long[]{2,7})).isEqualTo(new long[]{3,11});
       // assertThat(diffBit.solution(new long[]{1001,337,0,1,333,673,343,221,898,997,121,1015,665,779,891,421,222,256,512,128,100})).isEqualTo(new long[]{1002, 338, 1, 2, 334, 674, 347, 222, 899, 998, 122, 1019, 666, 781, 893, 422, 223, 257, 513, 129, 101});
    }
}