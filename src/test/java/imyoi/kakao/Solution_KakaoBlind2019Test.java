package imyoi.kakao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_KakaoBlind2019Test {
    private final static Solution_KakaoBlind2019 sk = new Solution_KakaoBlind2019();

    @Test
    void 오픈채팅방() {
        //given
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        //when
        String[] result = sk.solution01(record);

        //then
        assertArrayEquals(result, new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."});
    }
    
    @Test
    void 후보키() {
        //given
        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        
        //when
        int result = sk.solution02(relation);

        //then
        assertEquals(result, 2);
    }
}