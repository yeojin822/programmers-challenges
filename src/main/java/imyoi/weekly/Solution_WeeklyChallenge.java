package imyoi.weekly;

public class Solution_WeeklyChallenge {

    private static int answer = 0;

    /**
     * #87946 피로도
     * @param k : 유저의 현재 피로도
     * @param dungeons : 던전별 ["최소 필요 피로도", "소모 피로도"] 2차원 배열
     * @return 유저가 탐험할수 있는 최대 던전 수
     */
    public int solution01(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length]; //탐색처리
        dfs(dungeons, visited, k, 0);
        return answer;
    }

    public static void dfs(int[][] arr, boolean[] visited, int k, int cnt) {
        for(int i=0; i<arr.length; i++) {
            if(!visited[i] && k >= arr[i][0]) { //현재 피로도 >= 최소 필요 피로도
                visited[i] = true; //탐색시작
                dfs(arr, visited, k-arr[i][1], cnt+1); //던전 통과 시 경우의 수 더하기
                visited[i] = false; //탐색종료
            }
        }
        answer = Math.max(answer, cnt);
    }
}
