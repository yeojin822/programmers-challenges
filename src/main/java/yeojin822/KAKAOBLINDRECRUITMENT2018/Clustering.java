package yeojin822.KAKAOBLINDRECRUITMENT2018;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * [17677] [1차] 뉴스 클러스터링
 */
public class Clustering {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Pattern pattern = Pattern.compile("[^a-z]"); //기타 공백이나 숫자, 특수 문자 체크
        ArrayList str1List = new ArrayList();
        ArrayList str2List = new ArrayList();

        for (int i = 0; i < str1.length()-1; i++) {
            String s = str1.charAt(i) + String.valueOf(str1.charAt(i + 1));
            if(!pattern.matcher(s).find()) {
                str1List.add(s);
            }
        }

        for (int i = 0; i < str2.length()-1; i++) {
            String s = str2.charAt(i) + String.valueOf(str2.charAt(i + 1));
            if(!pattern.matcher(s).find()) {
                str2List.add(s);
            }
        }

        double union = addAll(new ArrayList<>(str1List),new ArrayList<>(str2List));
        double intersection = retainAll(new ArrayList<>(str1List),new ArrayList<>(str2List));

        if(union == 0 && intersection == 0){
            answer = 65536;
        }else{
            answer = (int)((intersection/union)*65536);
        }
        return answer;
    }
    //합집합
    public double addAll(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> list = new ArrayList<>();
        for (String str : list1) { // 중복을 허용하는 합집합
            if(list2.contains(str)) {
                list2.remove(str);
            }
            list.add(str);
        }
        list.addAll(list2);
        return list.size();
    }
    //교집합
    public double retainAll(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> list = new ArrayList<>();
        for (String str : list1) {
            if(list2.contains(str)) {
                list.add(str);
                list2.remove(str);
            }
        }
        return list.size();
    }
}
