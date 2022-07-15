package chrishoonS.summer_winter_2019;

class Solution13 {
    public long solution(int w, int h) {
        long answer = 1;
        long width = Long.valueOf(w);
        long height = Long.valueOf(w);

        answer = width * height - (width + height - getGcd(width, height));

        return answer;
    }

    private long getGcd(long width, long height) {

        long tmp = 0;
        long big = width;
        long small = height;

        if (width < height) {
            big = height;
            small = width;
        }

        long temp = 0;
        while (small > 0) {
            temp = big % small;//나누기

            big = small;//8, 4
            small = temp;//4, 0
        }
        return (big);
    }
}