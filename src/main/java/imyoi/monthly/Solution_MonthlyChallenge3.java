package imyoi.monthly;
import java.util.*;

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

    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * #86052 빛의 경로 사이클
     * @param grid : 격자의 정보를 나타내는 1차원 문자열 배열
     * @return  주어진 격자를 통해 만들어지는 빛의 경로 사이클의 모든 길이들을 배열에 담아 오름차순으로 정렬하여 return
     * */
    static int row, col;
    static int[] dr = {-1,0,1,0}, dc = {0,-1,0,1}; //아래, 왼, 위, 오른
    static boolean[][][] isVisited;

    public int[] solution02(String[] grid) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        row = grid.length;
        col = grid[0].length();

        isVisited = new boolean[row][col][4]; //빛의 도달했는지 여부
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int d = 0; d < 4; d++) {
                    if (!isVisited[i][j][d])
                        answer.add(light(grid, i, j, d )); //빛의 경로
                }
            }
        }

        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }

    private static int light(String[] grid, int r, int c, int d) {
        int cnt = 0;
        while (true) {
            if (isVisited[r][c][d]) break;
            cnt++;	 //거리증가
            isVisited[r][c][d] = true;

            if (grid[r].charAt(c) == 'L') //"L"이 써진 칸인 경우 좌회전
                d = d == 0 ? 3 : d-1;
            else if (grid[r].charAt(c) == 'R') //"R"이 써진 칸인 경우 회전
                d = d == 3 ? 0 : d+1;

            //범위를 벗어났을 경우
            r = (r + dr[d] + row) % row;
            c = (c + dc[d] + col) % col;
        }
        return cnt;
    }
}