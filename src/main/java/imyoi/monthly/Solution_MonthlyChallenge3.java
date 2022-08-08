package imyoi.monthly;

public class Solution_MonthlyChallenge3 {

    /**
     * #87390 n^2 배열 자르기
     * @param n
     * @param left
     * @param right
     * @return 주어진 과정대로 만들어진 1차원 배열
     * */
    public int[] solution(int n, long left, long right) {
        //(1,1)1 (1,2)2 (1,3)3
        //(2,1)2 (2,2)2 (2,3)3
        //(3,1)3 (3,2)3 (3,3)3
        //행, 열 중 최대값

        int[] answer = new int[(int)(right - left) + 1];
        int idx = 0;
        for(long i=left; i<=right; i++) {
         answer[idx++] = (int)Math.max(i/n+1,i%n+1);
        }

        return answer;
    }
}