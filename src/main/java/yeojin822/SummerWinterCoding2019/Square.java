package yeojin822.SummerWinterCoding2019;


/**
 * [62048] 멀쩡한 사각형
 */

public class Square {
    public long solution(int w, int h) {
        //유클리드 호제법
        long answer = 1;
        //전체 사각형수 - 사용하지 못하는 사각형의 수
        //(w * h) - (((w / gcd) + (h / gcd) - 1) * gcd)
        return (long)w * (long)h - ((long)w+(long)h-GCD(w,h));
    }
    //최대공약수
    public int GCD(int a, int b){
        return b > 0 ? GCD(b, a % b) : a;
    }
}
