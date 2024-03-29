package yeojin822.KAKAOBLINDRECRUITMENT2018;

import java.util.ArrayList;
import java.util.List;

/**
 * [17679] [1차] 프렌즈4블록
 */
public class Block {
    char[][] map;
    int answer ;

    public int solution(int m, int n, String[] board) {
        // String 배열은 변경이 어려우니 char[][] 배열로 바꿔서
        this.map = new char[m][n];
        this.answer = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                map[i][j] = board[i].charAt(j);
            }
        }

        // 지워질 블럭이 있는 경우 반복
        while(updateBlocks(m, n));

        return answer;
    }

    public boolean updateBlocks(int m, int n) {
        boolean[][] c = new boolean[m][n];
        int cnt = 0;

        // 체크
        for(int i = 0; i < m-1; i++) {
            for(int j = 0; j < n-1; j++) {
                if(map[i][j] == '0') continue;
                if(check(i, j) == true) {
                    c[i][j] = true;
                    c[i][j+1] = true;
                    c[i+1][j] = true;
                    c[i+1][j+1] = true;
                }
            }
        }

        // 갱신
        for(int i = 0; i < n; i++) {
            List<Character> temp = new ArrayList<>();
            for(int j = m-1; j >= 0; j--) {
                if(c[j][i] == true) {
                    cnt++;
                    continue;
                }
                temp.add(map[j][i]);
            }

            for(int j = m-1, k = 0; j >= 0; j--, k++) {
                if(k < temp.size())	map[j][i] = temp.get(k);
                else map[j][i] = '0';
            }
        }

        answer += cnt;
        return cnt > 0 ? true : false;
    }

    public boolean check(int i, int j) {
        char std = map[i][j];

        if(map[i][j+1] == std && map[i+1][j] == std && map[i+1][j+1] == std) return true;
        return false;
    }


}
