package yeojin822.월간코드챌린지시즌1;

/**
 * [70129] 이진 변환 반복하기
 */
public class Binary {
    public int[] solution(String s) {
        int zero = 0;
        int cnt = 0;

        while (s.length() != 1){
            zero += (s.length() -  s.replace("0","").length());
            s = s.replace("0","");
            s = Integer.toBinaryString(s.length());
            cnt++;
        }

        return new int[]{cnt,zero};
    }
}
