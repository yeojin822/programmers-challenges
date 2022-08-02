package imyoi.kakao;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution_KakaoPreCode2017Test {
    private final static Solution_KakaoPreCode2017 sk = new Solution_KakaoPreCode2017();

    @Test
    void 컬러링() {
        /*
          예제로 주어진 그림은 총 4개의 영역으로 구성되어 있으며,
          왼쪽 위의 영역과 오른쪽의 영역은 모두 1로 구성되어 있지만 상하좌우로 이어져있지 않으므로 다른 영역이다.
          가장 넓은 영역은 왼쪽 위 1이 차지하는 영역으로 총 5칸이다.
          1 1 1 0
          1 2 2 0
          1 0 0 1
          0 0 0 1
          0 0 0 3
          0 0 0 3
        */

        //given
        int m = 6;
        int n = 4;
        int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};

        //when
        int[] result = sk.solution(m,n,picture);
        System.out.println("result >>> " + Arrays.toString(result));

        //then
        assertArrayEquals(result, new int[]{4,5});
    }
}