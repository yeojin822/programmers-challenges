package yeojin822.KAKAOBLINDRECRUITMENT2020;

/**
 * [60057] 문자열 압축
 */
public class StringCompression {
    public int solution(String s) {
        int answer = s.length();

        for(int i = 1; i <= s.length() / 2; i++){ //길이 / 2를 넘으면 압축이 불가능
            StringBuilder result = new StringBuilder();
            int cnt = 1;
            String target = s.substring(0, i);
            for(int j = i; j <= s.length(); j += i){
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
                if(target.equals(next)){
                    cnt++;
                } else{
                    result.append((cnt != 1 ? cnt : "") + target);
                    target = next;
                    cnt = 1;
                }
            }
            result.append(target);
            answer = Math.min(answer, result.length()); // 문자 길이 비교
        }

        return answer;
    }
}
