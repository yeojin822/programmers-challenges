package chrishoonS.maester;

import java.util.LinkedList;
import java.util.Queue;

class Solution07 {
    static int answer, N, M;
    static int[] x = {-1,1,0,0}, y = {0,0,-1,1}; //x,y 좌표 setting
    static boolean[][] isVisit; //맵 방문 여부 체크용

    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        isVisit = new boolean[N][N];
        
        if(bfs(maps) == true)
            return answer;
        else return -1;
    }

    private static boolean bfs(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();    //queue declare
        queue.offer(new int[] {0,0});
        isVisit[0][0] = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            answer++;
            while(--size >= 0){
                int[] q = queue.poll();

                if (q[0] == N-1 && q[1] == M-1) return true;

                for (int i = 0; i < 4; i++) {
                    int nx = q[0] + x[i];
                    int ny = q[1] + y[i];

                    if (nx < 0 || ny < 0 || nx >= N || ny >= M || isVisit[nx][ny] || maps[nx][ny] == 0){
                        continue;
                    }
                    isVisit[nx][ny] = true;
                    queue.offer(new int[] {nx, ny});
                }
            }
        }
        return false;
    }
}