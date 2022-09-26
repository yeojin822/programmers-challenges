package yeojin822.코딩테스트고득점Kit.해시;

import java.util.Arrays;

/**
 * [42577] 전화번호 목록
 */
public class CallNumber {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length -1 ; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}
