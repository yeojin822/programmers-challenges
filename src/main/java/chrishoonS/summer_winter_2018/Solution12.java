package chrishoonS.summer_winter_2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution12 {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0, y = 0;
        ArrayList<String> visitList = new ArrayList<String>();

        for (int i = 0; i < dirs.length(); i++) {
            //현재 x, y 좌표를 초깃값으로 갖는 변수 선언
            int tmpX = x;
            int tmpY = y;
            char s = dirs.charAt(i);

            if (s == 'U' && y < 5)
                y++;
            else if (s == 'D' && y > -5)
                y--;
            else if (s == 'R' && x < 5)
                x++;
            else if (s == 'L' && x > -5)
                x--;

            // arrayList에 저장할 변수 선언
            String xy = Integer.toString(x);
            xy += Integer.toString(y);

            String tmpXY = Integer.toString(tmpX);
            tmpXY += Integer.toString(tmpY);

            String st = xy + tmpXY;
            String ed = tmpXY + xy;

            // visitList에 존재X, st와 ed가 같지 않으면 visitList에 add
            if (!visitList.contains(st) && !visitList.contains(ed) && !st.equals(ed)) {
                visitList.add(st);
                visitList.add(ed);
            }

        }

        // 이동 한 번에 2개의 값을 저장했으므로 /2한 값 반환
        answer = visitList.size() / 2;
        return answer;
    }
}