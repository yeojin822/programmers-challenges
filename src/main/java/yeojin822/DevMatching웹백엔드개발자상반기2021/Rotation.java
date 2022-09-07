package yeojin822.DevMatching웹백엔드개발자상반기2021;

/**
 * [77485] 행렬 테두리 회전하기
 */
public class Rotation {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] arrays = new int[rows][columns];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] =  (i * columns + j+1);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int x1 = query[0]-1, y1 =query[1]-1, x2 = query[2]-1, y2 = query[3]-1;
            int temp = arrays[x1][y1];
            int min = arrays[x1][y1];

            for (int j = x1+1; j <= x2; j++) {
                min = Math.min(min, arrays[j][y1]);
                arrays[j-1][y1] = arrays[j][y1];
            }
            for (int j = y1+1; j <= y2; j++) {
                min = Math.min(min, arrays[x2][j]);
                arrays[x2][j-1] = arrays[x2][j];
            }
            for (int j = x2-1; j >= x1; j--) {
                min = Math.min(min, arrays[j][y2]);
                arrays[j+1][y2] = arrays[j][y2];
            }
            for (int j = y2-1; j >= y1; j--) {
                min = Math.min(min, arrays[x1][j]);
                arrays[x1][j+1] = arrays[x1][j];
            }
            arrays[x1][y1+1] = temp;
            answer[i] = min;
        }

        return answer;
    }
}
