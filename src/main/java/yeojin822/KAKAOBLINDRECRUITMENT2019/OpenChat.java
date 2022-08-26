package yeojin822.KAKAOBLINDRECRUITMENT2019;

import java.util.*;

/**
 * [42888] 오픈채팅방
 */
public class OpenChat {
    public String[] solution(String[] record) {
        HashMap<String, String> nickName = new HashMap<>();
        List<String[]> inOut = new ArrayList();

        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            if(info[0].equals("Enter")){
                nickName.put(info[1], info[2]);
                inOut.add(new String[]{info[1], "님이 들어왔습니다."});
            }
            if(info[0].equals("Leave")){
                inOut.add(new String[]{info[1], "님이 나갔습니다."});
            }
            if(info[0].equals("Change")){
                nickName.put(info[1], info[2]);
            }
        }

        String[] answer = new String[inOut.size()];
        for (int i = 0; i < inOut.size(); i++) {
            answer[i] = nickName.get(inOut.get(i)[0]) + inOut.get(i)[1];
        }

        return answer;
    }
}
