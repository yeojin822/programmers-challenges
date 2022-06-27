package imyoi.tipstown;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_TipsTown2017Test {

    private final static Solution_TipsTown2017 st = new Solution_TipsTown2017();

    @Test
    void 짝지어_제거하기() {
        //given
        String s = "cdcd";

        //when
        int result = st.solution01(s);

        //then
        assertEquals(result, 0);
    }
}