package yeojin822.SummerWinterCoding2018;

/**
 * [49994] 방문 길이
 */

public class Visited {
    public int solution(String dirs) {
        int answer = 0;
        int[] dx = {0, 0, -1, 1}; //좌표기준 U D L R
        int[] dy = {1, -1, 0, 0};
        String[] dirsArray = dirs.split("");
        int[][][] line = new int[10+1][10+1][4];

        //가운데
        int x = 5;
        int y = 5;
        line[x][y]= new int[]{0, 0, 0, 0};

        for (int i = 0; i < dirsArray.length; i++) { //상하좌우
            int priD, d;
            switch (dirsArray[i]) {
                case "U":
                    d = 0; //U
                    priD = 1; //D
                    break;
                case "D":
                    d = 1; //D
                    priD = 0; //U
                    break;
                case "L":
                    d = 2; //L
                    priD = 3; //R
                    break;
                case "R":
                    d = 3; //R
                    priD =2; //L
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + dirsArray[i]);
            }
            if (x + dx[d] > line.length - 1 || y + dy[d] > line.length - 1 || x + dx[d] < 0 || y + dy[d] < 0) {
                continue;
            }else{
               line[x][y][priD] = 1;  //기존 왔던 방향 체크
               x = x + dx[d];
               y = y + dy[d];
            }

            if(line[x][y][d] != 1 ){
                answer++;
                line[x][y][d]=1;
            }
        }
        return answer;
    }
}
