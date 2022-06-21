package yeojin822.위클리챌린지;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 교점에 별 만들기
 */
public class MakeStar {
    public String[] solution(int[][] line) {
        List<long[]> list = new ArrayList<>();
        int minX = Integer.MAX_VALUE; //정수의 최대값(2147483647)
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE; //정수의 최소값(-2147483648)
        int maxY = Integer.MIN_VALUE;

        /*
        * x = (b*f) - (e*d)  // y = (e*c) - (a*f)
        *       (ad - bc)    //      (ad - bc)
        */

        for (int i = 0; i < line.length; i++) {
            for (int j = i+1; j < line.length; j++) {
                long[] lineA = Arrays.stream(line[i]).asLongStream().toArray(); // a b e => long 변환
                long[] lineB = Arrays.stream(line[j]).asLongStream().toArray(); // c d f

                long parent = lineA[0]*lineB[1] - lineA[1]*lineB[0]; //ad - bc
                if (parent == 0) continue; // 분모가 0인 경우 -> 서로 평행하거나 일치

                long xChild = lineA[1]*lineB[2] - lineA[2]*lineB[1]; // (b*f) - (e*d)
                long yChild = lineA[2]*lineB[0] - lineA[0]*lineB[2]; //(e*c) - (a*f);
                if (xChild % parent != 0 || yChild % parent != 0) continue; // 정수가 아닌 교차점

                int x = (int)(xChild/parent);
                int y = (int)(yChild/parent);


                list.add(new long[] {x, y});

                minX = Math.min(x,minX); // 좌표 최대/최소값 갱신
                minY = Math.min(y,minY);
                maxX = Math.max(x,maxX);
                maxY = Math.max(y,maxY);
            }
        }

        int h = maxY - minY + 1;
        int w = maxX - minX + 1;

        char[][] graph = new char[h][w]; // 높이와 넓이 만큼
        for(char[] m : graph) Arrays.fill(m, '.'); // 점으로 채우기
        for(long[] a : list) graph[(int)(maxY -a[1])][(int)(a[0] -minX)] = '*';
        String[] answer = new String[graph.length];
        for(int i = 0; i < graph.length; i++) answer[i] = new String(graph[i]);
        return answer;

    }
}
