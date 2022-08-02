package yeojin822.SummerWinterCoding2018;

import java.util.LinkedList;
import java.util.Queue;

/**
 * [12978] 배달
 */
public class Delivery {
    public int solution(int N, int[][] road, int K) {
        //플로이드 와샬 알고리즘
        int[][] map = new int[N][N];  //최단거리를 입력할 배열.

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (i == j) {
                    map[i][j] = 0; //같은 마을일때는 0
                    continue;
                }
                map[i][j] = 500001; //최대 배달시간 500,000
            }
        }

        for (int i = 0; i < road.length; i++) {
            if(map[road[i][0] - 1][road[i][1] - 1] < road[i][2]) //원래 있는 길이 더 적은 길이면 패쓰
                continue;
            map[road[i][0] - 1][road[i][1] - 1] = road[i][2];
            map[road[i][1] - 1][road[i][0] - 1] = road[i][2];
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    //최소시간 갱신
                    if (map[i][j] > map[i][k] + map[k][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }

        int count = 0;

        for (int i = 0; i < map.length; i++) { //처음 도시에 K이하 구하기
            if (map[0][i] <= K)
                count++;
        }

        return count;
    }
}
