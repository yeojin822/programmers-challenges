package imyoi.kakao;

import java.util.*;

public class Solution_KakaoDevMatching2021 {

    /**
     * #77485 행렬 테두리 회전하기
     * - x1 행 y1 열부터 x2 행 y2 열까지의 영역에 해당하는 직사각형에서 테두리에 있는 숫자들을 한 칸씩 시계방향으로 회전합니다.
     * @param rows : 행렬의 세로 길이(행 개수)
     * @param columns : 가로 길이(열 개수)
     * @param queries : 회전들의 목록
     * @return 각 회전들을 배열에 적용한 뒤, 그 회전에 의해 위치가 바뀐 숫자들 중 가장 작은 숫자들을 순서대로 담은 배열
     * */
    static int[] answer;
    static int[][] map;
    public int[] solution01(int rows, int columns, int[][] queries) {
        answer = new int[queries.length];

        //row x col 행렬 생성
        int[][] map = new int[rows][columns];
        int num = 1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                map[i][j] = num;
                num++;
            }
        }

        //테두리 회전
        for(int i=0; i<queries.length; i++) {
            int[] query = queries[i];
            int x1 = query[0]-1;
            int y1 = query[1]-1;
            int x2 = query[2]-1;
            int y2 = query[3]-1;
            int temp = map[x1][y1];
            int min = temp;

            for(int r=x1+1 ; r<=x2 ; r++) { //좌측
                min = Math.min(min, map[r][y1]);
                map[r-1][y1] = map[r][y1];
            }
            for(int c=y1+1 ; c<=y2 ; c++) { //하단
                min = Math.min(min, map[x2][c]);
                map[x2][c-1] = map[x2][c];
            }
            for(int r=x2-1 ; r>=x1 ; r--) { //우측
                min = Math.min(min, map[r][y2]);
                map[r+1][y2] = map[r][y2];
            }
            for(int c=y2-1 ; c>y1 ; c--) { //상단
                min = Math.min(min, map[x1][c]);
                map[x1][c+1] = map[x1][c];
            }
            map[x1][y1+1] = temp;
            answer[i] = min;
        }
        return answer;
    }
}