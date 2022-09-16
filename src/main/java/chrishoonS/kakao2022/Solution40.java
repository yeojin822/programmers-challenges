package chrishoonS.kakao2022;

public class Solution40 {
    public boolean isPrime(long n){
        if(n <= 1)
            return false;
        else if(n == 2)
            return true;

        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;

        return true;
    }
    public String toKnum(int n, int k) {
        String rst = "";
        while(n > 0) {
            rst = n % k + rst;
            n /= k;
        }
        return rst;
    }
    public int solution(int n, int k) {
        int answer = 0, i, j;
        String s = toKnum(n,k);

        for(i = 0; i < s.length(); i = j) {
            for(j = i + 1; j < s.length() && s.charAt(j) != '0'; j++);
            if(isPrime(Long.parseLong(s.substring(i,j))))
                answer++;
        }
        return answer;
    }
}