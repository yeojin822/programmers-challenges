package chrishoonS.monthCode1;

import java.util.ArrayList;

class Solution14 {
    public int[] solution(int n) {
        //배열 크기 설정
        int[] answer = new int[(n*(n+1))/2];
        int[][] tmpArr = new int[n][n];     //이차원 배열 생성
        int x = -1, y = 0;
        int num = 1;        //배열에 들어갈 숫자

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i%3 == 0) {
                    x++;
                }else if (i%3 == 1) {
                    y++;
                }else if (i%3 == 2) {
                    x--;
                    y--;
                }
                tmpArr[x][y] = num++;
            }
        }
        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(tmpArr[i][j] == 0)
                    break;
                answer[k++] = tmpArr[i][j];
            }
        }
        return answer;
    }
}