package yeojin822.월간코드챌린지시즌1;

/**
 * [68936] 쿼드압축 후 개수 세기
 */
public class Quadtree {
    int[][] arr;
    int zero;
    int one;

    public int[] solution(int[][] arr) {
        this.arr = arr;
        this.zero = 0;
        this.one = 0;
        quadTree(0,0,arr.length);
        return new int[]{zero,one};
    }

    public boolean check(int x, int y, int size) {
        int t = arr[x][y];

        for(int i=x; i < x+size; i++) {
            for(int j=y; j < y+size; j++) {
                if(t != arr[i][j]) return false;
            }
        }
        return true;
    }

    public void quadTree(int x, int y, int size) {
        if(check(x, y, size)) {
            if(arr[x][y] == 1){
                one++;
            }else{
                zero++;
            }
        }else {
            int newSize = size/2;
            quadTree(x, y, newSize);
            quadTree(x, y + newSize, newSize);
            quadTree(x + newSize, y, newSize);
            quadTree(x + newSize, y + newSize, newSize);
        }
    }
}
