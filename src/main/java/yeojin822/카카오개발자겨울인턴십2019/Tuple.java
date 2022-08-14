package yeojin822.카카오개발자겨울인턴십2019;

import java.util.Arrays;
import java.util.HashSet;

/**
 * [64065] 튜플
 */
public class Tuple {
    public int[] solution(String s) {
        HashSet<Integer> set = new HashSet<Integer>();
        String[] sArray = s.replaceAll("[{}]", " ").trim().split(" ,");
        int[] answer = new int[sArray.length];
        Arrays.sort(sArray, (a, b)->(a.length()-b.length()));

        int i = 0;
        for(String str : sArray){
            for(String st : str.split(",")){
                int a  = Integer.parseInt(st.trim());
                if(set.contains(a))continue;
                set.add(a);
                answer[i++] = a;
            }
        }
        return answer;
    }
}
