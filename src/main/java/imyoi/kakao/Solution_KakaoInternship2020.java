package imyoi.kakao;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_KakaoInternship2020 {

    /**
     * #67257 수식 최대화
     * - 연산자 우선순위를 새로 정의할 때, 같은 순위의 연산자는 없어야 한다
     * - 같은 연산자끼리는 앞에 있는 것의 우선순위가 더 높다
     * - 만약 계산된 결과가 음수라면 해당 숫자의 절댓값으로 변환하여 제출
     * @param expression : 참가자에게 주어진 연산 수식이 담긴 문자열
     * @return 우승 시 받을 수 있는 가장 큰 상금 금액
     * */
    public static long solution(String expression) {
        long answer = Long.MIN_VALUE;

        //3가지의 연산자(+, -, *)의 조합 = 3! = 6가지
        String[][] op = { {"+","-","*"},{"+","*","-"},{"-","*","+"}, {"-","+","*"}, {"*","-","+"}, {"*","+","-"} };

        String split[] = expression.split("(?<=[*/()+-])|(?=[*/+()-])");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(split));

        //연산자 우선순위대로 계산
        for (int i = 0; i < op.length; i++) {
            ArrayList<String> copyList = new ArrayList<String>(list);
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < copyList.size(); j++) {
                    if (op[i][k].equals(copyList.get(j))) { //우선순위 연산자와 list의 연산자가 같은 경우
                        copyList.set(j-1, String.valueOf(calculate(Long.parseLong(copyList.get(j-1)), copyList.get(j), Long.parseLong(copyList.get(j+1)))));
                        //계산 후 숫자, 연산자 제거
                        copyList.remove(j);
                        copyList.remove(j);
                        j--;
                    }
                }
            }
            //이전 값과 계산 후 저장된 값 중 최대값
            answer = Math.max(answer, Math.abs(Long.parseLong(copyList.get(0))));
        }
        return answer;
    }

    //연산
    public static long calculate(Long num1, String op, Long num2){
        switch (op){
            case "+" : return num1 + num2;
            case "-" : return num1 - num2;
            case "*" : return num1 * num2;
        }
        return 0;
    }
}