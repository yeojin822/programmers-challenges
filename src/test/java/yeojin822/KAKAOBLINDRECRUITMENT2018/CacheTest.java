package yeojin822.KAKAOBLINDRECRUITMENT2018;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CacheTest {
    Cache cache = new Cache();
    @Test
    void solution() {
        assertThat(cache.solution(3,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"})).isEqualTo(50);
        assertThat(cache.solution(3,new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"})).isEqualTo(21);
        assertThat(cache.solution(2,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})).isEqualTo(60);
        assertThat(cache.solution(5,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})).isEqualTo(52);
        assertThat(cache.solution(2,new String[]{"Jeju", "Pangyo", "NewYork", "newyork"})).isEqualTo(16);
        assertThat(cache.solution(0,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"})).isEqualTo(25);
    }
}
