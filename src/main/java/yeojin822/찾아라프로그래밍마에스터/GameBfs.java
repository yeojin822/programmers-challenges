package yeojin822.찾아라프로그래밍마에스터;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [1844] 게임 맵 최단거리
 */
public class GameBfs {
    boolean check[][];
    int[] dx = {0, 0, -1, 1}; //좌표기준 상 하 좌 우
    int[] dy = {-1, 1, 0, 0};

    public int solution(int[][] maps) {
        int answer = 0;
        this.check = new boolean[maps.length][maps[0].length];

        answer = bfs(0,0,maps);
        return answer;
    }

    //bfs
    public int bfs(int x, int y, int[][] maps){
        Queue<int[]>  q = new LinkedList<>();
        check[x][y] = true;
        q.add(new int[]{x,y,1});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int curX = now[0];
            int curY = now[1];
            int curD = now[2];

            if (curX == maps.length-1 && curY == maps[0].length-1)
                return curD;

            for (int i = 0; i < 4; i++) { //상하좌우
                int newX = curX + dx[i];
                int newY = curY + dy[i];
                if (newX >= 0 && newY >= 0 && newX < maps.length && newY < maps[0].length) {
                    if (maps[newX][newY] == 1 && !check[newX][newY]) {
                        check[newX][newY] = true;
                        q.add(new int[]{newX, newY, curD+1});
                    }
                }
            }
        }
        return -1;
    }
}
