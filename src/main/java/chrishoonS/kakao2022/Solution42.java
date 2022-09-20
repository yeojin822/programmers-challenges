package chrishoonS.kakao2022;

public class Solution42 {
    private int[] maxRet;
    private int maxScore;
    public int[] solution(int n, int[] info) {
        maxRet = new int[11];
        maxScore = 0;
        helper(info, n, 0, 0, 0, new int[11]);
        return maxScore==0?new int[]{-1}:maxRet;
    }
    public void helper(int[] info, int n, int score, int opponent, int idx, int[] arr) {
        if(idx==10) {
            if(score-opponent>=maxScore) {
                arr[idx] = n;
                if(maxScore<(score-opponent)) {
                    // set
                    setArr(arr);
                    maxScore = score-opponent;

                } else if(maxScore==(score-opponent)) {
                    // sort check -> set
                    if(checkSort(arr)) setArr(arr);
                }
            }
            return;
        }
        // 이길떄
        if(info[idx]<n) {
            arr[idx] = info[idx]+1;
            helper(info, n-(info[idx]+1), score+(10-idx), opponent, idx+1, arr);
        }
        // 질때
        arr[idx] = 0;
        helper(info, n, score, opponent+(info[idx]>0?(10-idx):0), idx+1, arr);
        return;
    }

    public void setArr(int[] arr) {
        for(int i=0 ; i<=10 ; i++) {
            maxRet[i] = arr[i];
        }
        return;
    }

    public boolean checkSort(int[] arr) {
        for(int i=10 ; i>=0 ; i--) {
            if(maxRet[i]==arr[i]) {
                continue;
            } else if(maxRet[i]<arr[i]) {
                return true;
            } else {
                break;
            }
        }
        return false;
    }
}