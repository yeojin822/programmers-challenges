package chrishoonS.summer_winter_2018;

class Solution10 {
    public int solution(int n) {
        int ans = 0;
        while (n != 0){
            if(n%2 == 0) n /= 2;
            else{
                n -= 1;
                ans++;
            }
        }
        return ans;
    }
}