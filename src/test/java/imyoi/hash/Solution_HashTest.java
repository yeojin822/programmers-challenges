package imyoi.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Solution_HashTest {
    private final static Solution_Hash sh = new Solution_Hash();

    @Test
    void 전화번호_목록() {
        String[] phone_book = {"12","123","1235","567","88"};
        boolean result = sh.solution01(phone_book);

        assertFalse(result);
    }

    @Test
    void 위장() {
        String[][] clothes = {{"yellow_hat","headgear"}
                , {"blue_sunglasses","eyewear"}
                , {"green_turban","headgear"}};

        int result = sh.solution02(clothes);

        assertEquals(result, 5);
    }
}