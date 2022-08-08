package imyoi.kakao;

import java.awt.*;
import java.util.*;

public class Solution_KakaoInternship2021 {

    static int moveX[] = {-1,0,1,0};
    static int moveY[] = {0,1,0,-1};

    /**
     * #81302 거리두기 확인하기
     * places 원소의 길이(대기실 가로 길이) = 5
     * P = 응시자가 앉아있는 자리를 의미합니다.
     * O = 빈 테이블을 의미합니다.
     * X = 파티션을 의미합니다.
     * @param places : 자리에 앉아있는 응시자들의 정보와 대기실 구조를 대기실별로 담은 2차원 문자열 배열
     * @return 각 대기실별로 거리두기를 지키고 있으면 1을, 한 명이라도 지키지 않고 있으면 0을 배열에 담아 return
     * */
    //거리두기 확인하기
    public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for(int i=0; i<places.length; i++) {
            String p[] = places[i]; //i 번째 대기실(행)
            System.out.println("check1 >>> "+ Arrays.toString(p));

            boolean isCheck = true;
            for(int j=0; j<5 && isCheck; j++) { //i 번째 대기실 내의 열
                System.out.println("check2 >>> "+ p[j]);
                for(int k=0; k<5 && isCheck; k++) {
                    if(p[j].charAt(k) == 'P') { //해당 자리가 P(응시자가 앉아있는 자리)라면
                        if(!bfs(j,k,p)) isCheck = false; //bfs 탐색
                    }
                }
            }
            //거리두기를 지키면 1 아니면 0
            answer[i] = isCheck ? 1 : 0;
        }
        return answer;
    }

    public static boolean bfs(int r, int c, String []places) {
        Queue<Point> queue = new LinkedList<Point>();
        queue.add(new Point(r,c));

        while(!queue.isEmpty()) {
            Point p = queue.poll();
            for(int d=0; d<4; d++) {
                int nextRow = p.x + moveY[d];
                int nextCol = p.y + moveX[d];
                if(nextCol<0 || nextRow<0 || nextCol>=5 || nextRow>=5 || (nextCol == c && nextRow == r)) {
                    continue;
                }

                //맨해튼거리
                int distance = Math.abs(nextCol - c) + Math.abs(nextRow - r);
                System.out.println("distance >>> " + distance);

                //사람이 있으면(P)
                if(places[nextRow].charAt(nextCol) == 'P' && distance <= 2)
                    return false;
                //사이에 빈 테이블(O)이 있는 경우
                else if(places[nextRow].charAt(nextCol) == 'O' && distance < 2)
                    queue.offer(new Point(nextRow, nextCol));
            }
        }
        return true;
    }
}