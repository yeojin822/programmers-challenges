package yeojin822.KAKAOBLINDRECRUITMENT2018;

import java.util.ArrayList;
import java.util.HashMap;

public class Compress {
    public int[] solution(String msg) {
        int[] answer = {};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<String, Integer> hs = new HashMap<String,Integer>();
        int idx = 1;

        for(char i = 'A'; i<='Z'; i++){
            hs.put(i+"",idx++);
        }
        int size = msg.length();
        for(int i =0; i< size; i++){
            int a = 1;
            while(i+a<=size && hs.containsKey(msg.substring(i,i+a))){
                a++;
            }
            if(i+a>size){
                ans.add(hs.get(msg.substring(i)));
                break;
            }
            ans.add(hs.get(msg.substring(i,i+a-1)));
            hs.put(msg.substring(i,i+a),idx++);
            if(a>1)i+=a-2;
        }

        answer = ans.stream().mapToInt(i -> i).toArray();

        return answer;
    }
// 런타임 에러남
//   public static ArrayList<Integer> comp;//압축용
//   public static int dictIdx;

//    public int[] solution(String msg) {
//        int[] answer = {};
//        this.dic = new HashMap<>();
//        this.comp = new ArrayList();
//        this.dictIdx = 1;
//
//        for (int i = 'A'; i < 'Z'; i++) {
//            dic.put(String.valueOf((char) i),dictIdx++);
//        }
//        compress(msg);
//        answer = comp.stream().mapToInt(i -> i).toArray();
//        return answer;
//    }
//
//    public void compress(String msg){
//        if (msg.isEmpty()){
//            return;
//        }
//        String w = "";
//        String c = "";
//        int max = Integer.MIN_VALUE;
//        for (String key : dic.keySet()) {
//            if(msg.startsWith(key)){
//                max = Math.max(max, key.length());
//                w = (max == key.length() ? key : w);
//            }
//        }
//        comp.add(dic.get(w));
//
//       msg = msg.replaceFirst(w,"");
//
//        if(msg.length() > 0){
//            c = msg.substring(0,1);
//            dic.put(w+c, ++dictIdx);
//        }
//
//        compress(msg);
//    }
}
