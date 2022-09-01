package imyoi.kakao;

public class Solution_KakaoBlind2020 {

    /**
     * #60057 문자열 압축
     * 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현해 더 짧은 문자열로 줄여서 표현하는 알고리즘
     * 1개 단위로 잘라서 압축할 경우 반복되는 문자가 적을 경우 압축률이 낮음
     * @param s : 알파벳소문자로 이루어진 압축할 문자열
     * @return 1개 이상 단위로 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이
     * */
    public int solution01(String s) {
        int answer = s.length();

        for(int i=1; i<=s.length()/2; i++){
            int count = 0; //반복 횟수
            StringBuffer sb = new StringBuffer();
            String baseStr = s.substring(0, i);
            for(int j=0; j<=s.length(); j+=i){
                int endIdx = Math.min(j + i, s.length());
                String compareStr = s.substring(j, endIdx);
                if(baseStr.equals(compareStr)){
                    count++;
                } else {
                    if(count > 1){
                        sb.append(count);
                    }
                    sb.append(baseStr);
                    baseStr = compareStr;
                    count = 1;
                }
            }
            sb.append(baseStr);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}