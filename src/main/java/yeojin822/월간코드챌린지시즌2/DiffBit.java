package yeojin822.월간코드챌린지시즌2;

/**
 * [77885] 2개 이하로 다른 비트
 */
public class DiffBit {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            char[] temp = Long.toBinaryString(numbers[i]).toCharArray();
            if(Long.toBinaryString(numbers[i]).contains("0")) {
                for (int j = temp.length - 1; j >= 0; j--) {
                    if (temp[j] == '0' && j == temp.length - 1) {
                        temp[j] = '1';
                        break;
                    } else if (temp[j] == '0') {
                        temp[j] = '1';
                        temp[j + 1] = '0';
                        break;
                    }
                }
            }else{
                temp[0] = '0';
                String temp1 = 1+String.valueOf(temp);
                temp = temp1.toCharArray();
            }
            answer[i] = Long.parseLong(String.valueOf(temp), 2);
        }
        return answer;
    }
}
