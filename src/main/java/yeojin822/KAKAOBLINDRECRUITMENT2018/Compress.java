package yeojin822.KAKAOBLINDRECRUITMENT2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Compress {
   public static int[] answer = {};
   public static HashMap<String, Integer> dic = new HashMap<>(); //사전용
   public static ArrayList<Integer> comp = new ArrayList(); //압축용
   public static int dictIdx = 1;

    public int[] solution(String msg) {
        for (int i = 'A'; i < 'Z'; i++) {
            dic.put(String.valueOf((char) i),dictIdx++);
        }
        compress(msg);
        answer = comp.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public void compress(String msg){
        if (msg.isEmpty()){
            return;
        }
        String w = "";
        String c = "";
        int max = Integer.MIN_VALUE;
        for (String key : dic.keySet()) {
            if(msg.startsWith(key)){
                max = Math.max(max, key.length());
                w = (max == key.length() ? key : w);
            }
        }
        comp.add(dic.get(w));
        msg.replaceFirst(w,"");

        if(msg.length() > 0){
            c = msg.substring(0,1);
            dic.put(w+c, dictIdx++);
        }
        compress(msg);
    }
}
