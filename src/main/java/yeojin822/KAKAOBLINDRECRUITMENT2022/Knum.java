package yeojin822.KAKAOBLINDRECRUITMENT2022;

import java.util.Arrays;

/**
 * [92335] k진수에서 소수 개수 구하기
 */
public class Knum {
    public int solution(int n, int k) {
        int answer = 0;
        String[] knums = Integer.toString(n,k).split("0");
        System.out.println(Arrays.toString(knums));

        for (int i = 0; i < knums.length; i++) {
            if(knums[i].equals("")) continue;
            long num = Long.parseLong(knums[i]);
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }

    //소수 확인하기 - 에라토스테네스의 체
    public boolean isPrime (long n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}


