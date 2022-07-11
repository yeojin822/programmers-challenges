package yeojin822.SummerWinterCoding2018;

import java.util.HashSet;

/**
 * [12981] 영어 끝말잇기
 */
public class WordRelay {
    public int[] solution(int n, String[] words) {
        HashSet set = new HashSet();
        int size = 0;
        int dupIdx = 0;

        for (int i = 0; i < words.length; i++) {
            if(words[i].length()> 1){
                set.add(words[i]);
                if (size != set.size()) {
                    size = set.size();
                    if(i < words.length-1) {
                        if (words[i].charAt(words[i].length() - 1) != words[i+1].charAt(0)) {
                            dupIdx = i + 1;
                            break;
                        }
                    }
                } else {
                    dupIdx = i;
                    break;
                }
            }else{
                dupIdx = i;
                break;
            }
        }

        if(dupIdx != 0){
        return  new int[]{ (dupIdx % n) + 1,(dupIdx / n) + 1 };
        }else{
           return new int[]{0,0};
        }
    }
}
