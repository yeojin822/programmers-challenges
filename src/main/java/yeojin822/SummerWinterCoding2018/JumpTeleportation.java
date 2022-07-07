package yeojin822.SummerWinterCoding2018;

/**
 * [12980] 점프와 순간 이동
 */
public class JumpTeleportation {
    public int solution(int n) {
        int ans = 0;
        String num = Integer.toBinaryString(n);
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
}
