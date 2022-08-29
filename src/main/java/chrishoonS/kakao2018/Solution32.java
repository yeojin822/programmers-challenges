package chrishoonS.kakao2018;

public class Solution32 {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "0";
        int count = 0;

        while (str.length() < (t * m + p)) {
            String byNum = "";
            int num = count++;

            while (num != 0) {
                if (num % n >= 10) {
                    byNum += String.valueOf((char) (num % n + 55));
                }
                else {
                    byNum += String.valueOf(num % n);
                }

                num /= n;
            }

            str += new StringBuffer(byNum).reverse().toString();
        }


        for (int i = 0; i < t; i++)
            answer += String.valueOf(str.charAt(m * i + p - 1));

        return answer;
    }
}
