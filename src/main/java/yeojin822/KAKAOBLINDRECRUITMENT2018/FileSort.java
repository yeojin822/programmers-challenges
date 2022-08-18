package yeojin822.KAKAOBLINDRECRUITMENT2018;

import java.util.Arrays;
import java.util.Comparator;

/**
 * [17686] [3차] 파일명 정렬
 */
public class FileSort {
    public String[] solution(String[] files) {
        String[] answer = {};

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //숫자로 잘라서 head 값 비교
                String head1 = o1.split("[0-9]")[0];
                String head2 = o2.split("[0-9]")[0];

                int result = head1.toLowerCase().compareTo(head2.toLowerCase());

                //head값이 같을 경우 숫자로 비교
                if(result == 0){
                    result = strToNum(o1,head1) - strToNum(o2,head2);
                }

                return result;
            }
        });

        return files;
    }

    public int strToNum (String str, String head){
       String result = "";
       str = str.substring(head.length());
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c) && result.length() < 5){
                result += c;

            }else{
                break;
            }
        }
        return Integer.parseInt(result);
    }
}
