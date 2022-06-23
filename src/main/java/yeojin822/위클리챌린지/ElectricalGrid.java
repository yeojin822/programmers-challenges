package yeojin822.위클리챌린지;

import java.util.*;

/**
 * [86971] 전력망을 둘로 나누기
 */
public class ElectricalGrid {
    int[][] line;

    public int solution(int n, int[][] wires) {
        int answer = n;
        line = new int[n+1][n+1];

        // 전선 그리기
        for(int i=0; i<wires.length; i++){
            // ex 1 <-> 2
            line[wires[i][0]][wires[i][1]]=1;
            line[wires[i][1]][wires[i][0]]=1;
        }


        int a, b;
        for(int i=0; i<wires.length; i++){
            a= wires[i][0];
            b= wires[i][1];

            //선을 하나 끊고
            line[a][b]=0;
            line[b][a]=0;

            //bfs
            answer= Math.min(answer, bfs(n, a));

            //선 다시 복구
            line[a][b]=1;
            line[b][a]=1;
        }
        return answer;
    }

    //bfs로 풀어보기
    public int bfs(int n, int nodeIdx){
        Queue<Integer> q = new LinkedList<>();
        boolean check[] = new boolean[n+1];
        int cnt=1;
        check[nodeIdx] = true;
        q.add(nodeIdx);

        while(!q.isEmpty()){
            int now = q.poll();
            for(int i = 1; i <= n; i++){
                if(line[now][i] == 1 && !check[i]) {
                    check[i] = true;
                    q.add(i);
                    cnt++;
                }
            }
        }
        return Math.abs(cnt-(n-cnt));
    }
}
