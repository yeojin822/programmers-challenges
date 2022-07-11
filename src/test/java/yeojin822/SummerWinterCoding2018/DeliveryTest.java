package yeojin822.SummerWinterCoding2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    Delivery delivery = new Delivery();
    @Test
    void solution() {
        assertThat(delivery.solution(5,new int[][]{{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}},3)).isEqualTo(4);
       // assertThat(delivery.solution(6,new int[][]{{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}},4)).isEqualTo(4);
    }
}
