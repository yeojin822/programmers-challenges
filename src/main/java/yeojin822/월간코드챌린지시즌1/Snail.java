package yeojin822.월간코드챌린지시즌1;

/**
 * [68645] 삼각 달팽이
 */
public class Snail {
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        int[][] array= new int[n][n];

        int x=-1, y=0, num=1;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i%3==0){ //아래로
                    x++;
                }else if(i%3==1){//오른쪽으로
                    y++;
                }else{//대각선으로
                    x--;
                    y--;
                }
                array[x][y]= num++;
            }
        }

        num=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(array[i][j]==0) break;
                answer[num++]= array[i][j];
            }
        }

        return answer;
    }
}
