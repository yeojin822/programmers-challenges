package yeojin822.카카오코드본선2017;

/**
 * [1835] 단체사진 찍기
 */
public class Photo {
    private int answer;
    private String[] kakao = {"A", "C", "F", "J", "M", "N", "R", "T"};
    boolean[] visited;

    public int solution(int n, String[] data) {
        this.visited = new boolean[kakao.length];
        this.answer = 0;
        dfs("",data);
        return answer;
    }

    private void dfs(String names,String[] datas) {
        if (names.length() == 7) {
            if (check(names, datas)) { // 조건만족 체크
                answer++;
            }
            return;
        }
        for (int i = 0; i < 8; i++) { // 조합
            if (!visited[i]) {
                visited[i] = true;
                String name = names + kakao[i];
                dfs(name, datas);
                visited[i] = false;
            }
        }
    }

    // 조건 체크
    private boolean check(String names, String[] datas) {
        for (String data : datas) {
            int p1 = names.indexOf(data.charAt(0)); // 프렌즈1
            int p2 = names.indexOf(data.charAt(2)); // 프렌즈2
            char op = data.charAt(3); // 수식
            int index = data.charAt(4) -'0'; // 간격
            if (op == '=') {
                if (!(Math.abs(p1 - p2) == index+1)) return false; //둘 포지션 차이를 구하기 위해선 index+1 을 해야함에 주의
            } else if (op == '>') {
                if (!(Math.abs(p1 - p2) > index+1)) return false;
            } else if (op == '<') {
                if (!(Math.abs(p1 - p2) < index+1)) return false;
            }
        }
        return true;
    }
}
