package chrishoonS.summer_winter_2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution12 {
    public int solution(String dirs) {
        int answer = 0;
        int x=0, y=0;
        ArrayList<String> visitList = new ArrayList<>();

        for (int i = 0; i < dirs.length(); i++) {
            int tmpX = x, tmpY = y;
            char ch = dirs.charAt(i);

            if(y < 5 && ch =='U'){
                y++;
            }else if(y > -5 && ch =='D'){
                y--;
            }else if(x < 5 && ch =='R'){
                x++;
            }else if(y > -5 && ch =='L'){
                x--;
            }
        }

        System.out.println(answer);

        return answer;
    }
}