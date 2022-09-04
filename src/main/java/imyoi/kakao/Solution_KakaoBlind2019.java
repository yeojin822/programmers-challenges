package imyoi.kakao;

import java.util.*;

public class Solution_KakaoBlind2019 {

    /**
     * #42888 오픈채팅방
     * - Enter : 입장 | Leave : 퇴장 | Change : 변경
     * - 각 단어는 공백으로 구분되어 있으며, 알파벳 대문자, 소문자, 숫자로만 이루어져있다.
     * @param record : 채팅방에 들어오고 나가거나, 닉네임을 변경한 기록이 담긴 문자열 배열
     * @return 모든 기록이 처리된 후, 최종적으로 방을 개설한 사람이 보게 되는 메시지를 문자열 배열
     * */
    public String[] solution01(String[] record) {
        ArrayList<String> arr = new ArrayList();
        Map<String, String> usrInfo = new HashMap();

        for (int i = 0; i < record.length; i++) { //record 반복탐색 (행동, 유저아이디, 닉네임)
            String[] command = record[i].split(" "); //공백 기준으로 나누기
            if (command[0].equals("Enter")) { //입장
                arr.add(command[1] + "님이 들어왔습니다.");
                usrInfo.put(command[1], command[2]);
            } else if (command[0].equals("Leave")) { //퇴장
                arr.add(command[1] + "님이 나갔습니다.");
                continue;
            } else { //변경
                usrInfo.put(command[1], command[2]);
            }
        }

        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            String[] temp = arr.get(i).split(" ");
            //아이디 -> 닉네임으로 변환
            String nickName = usrInfo.get(arr.get(i).substring(0, arr.get(i).indexOf("님")));
            answer[i] = nickName + "님이 " + temp[1];
        }
        return answer;
    }

    /*--------------------------------------------------------------------------------------------------------------*/
    /**
     * #42890 후보키
     * @param relation : 2차원 문자열 배열
     * @return 후보 키의 개수 return
     * */
    static ArrayList<HashSet<Integer>> candidateKeys; //후보키
    static int answer;
    public int solution02(String[][] relation) {;
        candidateKeys = new ArrayList<>();
        HashSet<Integer> keys = new HashSet<>();
        for(int i = 1; i <= relation[0].length; i++) {
            combination(0, 0, i, keys, relation[0].length, relation);
        }

        return answer;
    }

    private void combination(int idx, int start, int keysize, HashSet<Integer> keys, int n, String[][] relation) {
        if(idx == keysize) {
            //중복방지
            for(HashSet<Integer> key : candidateKeys) {
                if(keys.containsAll(key)) return;
            }

            int count = 0;
            HashMap<String, String> map = new HashMap<>();
            for(int i = 0; i < relation.length; i++) {
                StringBuilder sb = new StringBuilder();
                for(int k : keys) {
                    sb.append(relation[i][k]);
                }
                if(map.containsKey(sb.toString())) return; //중복 선택시 멈춤
                map.put(sb.toString(), sb.toString());
                count++;
            }

            //후보키 저장
            if(count == relation.length) {
                candidateKeys.add(keys);
                answer++;
            }
            return;
        }

        for(int i = start; i < n; i++) {
            HashSet<Integer> selectedKeys = new HashSet<>(keys);
            selectedKeys.add(i);
            combination(idx+1, i+1, keysize, selectedKeys, n, relation);
        }
    }
}