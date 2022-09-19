package imyoi.kakao;

import java.util.*;

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

    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * #92341 주차 요금 계산
     * - fee의 길이 = 4
     * @param fees : 주차요금을 나타내는 정수 배열
     * @param records : 자동차의 입/출차 내역을 나타내는 문자열 배열
     * @return 차량 번호가 작은 자동차부터 청구할 주차 요금을 차례대로 정수 배열에 담아서 return
     * */
    public int[] solution02(int[] fees, String[] records) {
        Map<Integer, Integer> startTime = new HashMap<>();
        Map<Integer, Integer> totalTime = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        //입/출차 기록 분리
        for (String s : records) {
            String[] str = s.split(" ");
            String[] times = str[0].split(":");
            int min = (Integer.parseInt(times[0]) * 60) + Integer.parseInt(times[1]);
            int num = Integer.parseInt(str[1]);
            if (!startTime.containsKey(num)) {
                set.add(num);
                startTime.put(num, min);
                if (!totalTime.containsKey(num)) {
                    totalTime.put(num, 0);
                }
            } else {
                totalTime.put(num, totalTime.get(num) + min - startTime.get(num));
                startTime.remove(num);
            }
        }

        int INF = (23 * 60) + 59; //출차내역이 없으면 23:59분에 출차된 것으로 간주
        for (Integer key : startTime.keySet()) {
            totalTime.put(key, totalTime.get(key) + INF - startTime.get(key));
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int num : list) {
            int time = totalTime.get(num);
            if (time <= fees[0]) {
                answer[idx] = fees[1];
            } else {
                answer[idx] = (int) (fees[1] + Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3]);
            }
            idx++;
        }

        return answer;
    }
}