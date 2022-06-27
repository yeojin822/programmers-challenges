package yeojin822.위클리챌린지;

/**
 * 피로도
 */
public class Fatigue {
    boolean[] visit;
    int[][] dungeons;
    int answer=0;

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        this.visit = new boolean[dungeons.length];

        for(int i=0;i<dungeons.length;i++) {
            if (k >= dungeons[i][0]){
               dfs(i,k,1);
            }
        }

       return answer;
    }
    //dfs 이용 완전탐색 (재귀함수로 구현)
    private void dfs(int idx, int tired,int depth) {
        //방문한곳 ture
        visit[idx]=true;
        tired -= dungeons[idx][1];

        for(int i=0;i<dungeons.length;i++) {
            if(!visit[i] && dungeons[i][0] <= tired){
                dfs(i,tired,depth+1);
            }
        }
        //깊이 비교
        answer = Math.max(depth, answer);
        visit[idx]=false;
    }


}
