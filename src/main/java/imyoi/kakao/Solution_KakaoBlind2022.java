package imyoi.kakao;

public class Solution_KakaoBlind2022 {

    /**
     * #92335 k진수에서 소수 개수 구하기
     * - 0P0처럼 소수 양쪽에 0이 있는 경우
     * - P0처럼 소수 오른쪽에만 0이 있고 왼쪽에는 아무것도 없는 경우
     * - 0P처럼 소수 왼쪽에만 0이 있고 오른쪽에는 아무것도 없는 경우
     * - P처럼 소수 양쪽에 아무것도 없는 경우
     * @param n : 양의 정수
     * @param k : 진수
     * @return 조건에 맞는 소수가 몇 개인지 리턴
     * */
    public int solution01(int n, int k) {
        int answer = 0;
        String num = Integer.toString(n, k); //k진수로 변경

        String[] arr = num.split("0"); //0 기준으로 분리
        for(String s : arr){
            if(s.equals("")) continue; //0인 경우 예외
            if(isPrime(Long.parseLong(s))) { //소수 판별
                answer++;
            }
        }
        return answer;
    }

    public static boolean isPrime(long num){
        if(num == 1) return false;
        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}