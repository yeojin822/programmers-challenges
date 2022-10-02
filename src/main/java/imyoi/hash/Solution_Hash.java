package imyoi.hash;

import java.util.Arrays;
import java.util.HashMap;

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

    /**
     * #42578 위장
     * @param clothes : 스파이가 가진 의상들이 담긴 2차원 배열
     * @return 서로 다른 옷의 조합의 수
     * */
    public int solution02(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++){
            String cloth_type = clothes[i][1];
            map.put(cloth_type, map.getOrDefault(cloth_type, 1) + 1);
        }
        for (String s : map.keySet()) {
            answer *= map.get(s);
        }

        return answer -1;
    }
}