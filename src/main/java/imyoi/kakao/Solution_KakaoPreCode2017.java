package imyoi.kakao;

public class Solution_KakaoPreCode2017 {
    static int numberOfArea;
    static int maxSizeOfOneArea;
    static int[] dX = {1,-1,0,0};
    static int[] dY = {0,0,1,-1};
    static int cnt = 0;

    /**
     * #1829 카카오 프렌즈 컬러링 북
     * 영역이란 상하좌우로 연결된 같은 색상의 공간을 의미한다.
     * picture의 원소 중 값이 0인 경우는 색칠하지 않는 영역을 뜻한다.
     * @param m
     * @param n
     * @param picture
     * @return 그림에 몇 개의 영역이 있는지와 가장 큰 영역의 넓이는 얼마인지 계산
     * */
    public int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0; //그림 내 색칠된 영역의 수
        maxSizeOfOneArea = 0; //가장 넓은 영역의 칸 수

        boolean[][] isCheck = new boolean[m][n]; //방문체크

        //pictrue 탐색
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {

                //색칠된 영역 중 탐색한 적이 없는 경우 탐색 시작
                if(picture[i][j] != 0 && !isCheck[i][j]) {
                    numberOfArea++;
                    dfs(picture, i, j, isCheck); //재귀호출
                }
                if(cnt > maxSizeOfOneArea)
                    maxSizeOfOneArea = cnt;
                cnt = 0;
            }
        }

        return new int[]{numberOfArea, maxSizeOfOneArea};
    }

    public static void dfs(int[][] picture, int x, int y, boolean[][] isCheck) {
        //방문한 적이 있는 경우 패스
        if(isCheck[x][y]) return;

        isCheck[x][y] = true;
        cnt++;

        for(int i=0; i<4; i++) {
            int nX = x + dX[i];
            int nY = y + dY[i];

            if(nX < 0 || nX >= picture.length || nY<0 || nY >= picture[0].length) continue;

            if(picture[x][y] == picture[nX][nY] && !isCheck[nX][nY]){
                dfs(picture, nX, nY, isCheck);
            }
        }
    }
}