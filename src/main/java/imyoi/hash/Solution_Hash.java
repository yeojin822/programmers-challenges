package imyoi.hash;

import java.util.Arrays;

public class Solution_Hash {

    /**
     * #42577 전화번호 목록
     * @param phone_book : 전화번호부에 적힌 전화번호를 담은 배열
     * @return 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true
     * */
    public boolean solution01(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}