package yeojin822.월간코드챌린지시즌3;

public class SplitArray {

/**
 * [87390]n^2 배열 자르기
 */
public int[] solution(int n, long left, long right) {
    int[] answer = new int[(int) (right - left) + 1];

    for (int i = 0; i < answer.length; i++) {
        int row = (int) ((i + left) / n) + 1; // 행
        int col = (int) ((i + left) % n) + 1; // 열
        answer[i] = Math.max(row, col);
    }

    return answer;
}

// 메모리 초과
/*    public int[] solution(int n, long left, long right) {
    int[] answer = {};
    Integer[][] array = new Integer[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if(j <= i) {
                array[i][j] = i+1;
            }else{
                array[i][j] = j+1;
            }
        }
    }
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        list.addAll(new ArrayList(Arrays.asList(array[i])));
    }
    int[] arr =  list.stream().mapToInt(Integer::intValue).toArray();
    answer = Arrays.copyOfRange(arr,(int)left,(int)right+1);

    return answer;
}*/
}
