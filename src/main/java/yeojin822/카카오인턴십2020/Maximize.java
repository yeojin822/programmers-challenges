package yeojin822.카카오인턴십2020;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * [67257] 수식 최대화
 */
public class Maximize {
    static String[] op = {"+", "-", "*"};
    static boolean[] check = new boolean[3];
    static long answer;
    static String[] numStr;
    static String[] opStr;

    public long solution(String expression) {
        this.answer = 0;
        this.numStr = expression.replaceAll("[^0-9]", " ").split(" ");
        this.opStr = expression.replaceAll("[0-9]", "").split("");
        ArrayList<String> list = new ArrayList<String>();
        int start = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-' || expression.charAt(i) == '+' || expression.charAt(i) == '*') {
                list.add(expression.substring(start, i)); // 연산자 앞 숫자 추가
                list.add(expression.charAt(i) + ""); // 연산자 추가
                start = i + 1;
            }
        }

        list.add(expression.substring(start)); // 마지막 숫자 추가

        dfs(0,new String[3]);

        return answer;
    }

    public static void dfs(int count, String[] p) {
        for(int i=0; i< 3; i++){ //연산자 경우의 수
            if(!check[i]){
                check[i] = true;
                p[count] = op[i];
                dfs(count+1,p);
                check[i] = false;
            }
        }

        if (count == 3) { //우선순위가 다 정해지면
            ArrayList<String> cNums = new ArrayList<>(Arrays.asList(numStr));
            ArrayList<String> cOps = new ArrayList<>(Arrays.asList(opStr));

            for (int i = 0; i < p.length; i++) {
                for (int j = 0; j < cOps.size(); j++) {
                    if (p[i].equals(cOps.get(j))) { //우선순위가 같은 연산자 먼저 계산
                        String res = calc(Long.parseLong(cNums.remove(j)),Long.parseLong(cNums.remove(j)), p[i]);
                        cNums.add(j, res);
                        cOps.remove(j);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(Long.parseLong(cNums.get(0))));return;
        }
    }

    static String calc(long x, long y, String op) {
        switch (op) {
            case "-":
                return x - y +"";
            case "+":
                return x + y +"";
            default:
                return x * y +"";
        }
    }
}
