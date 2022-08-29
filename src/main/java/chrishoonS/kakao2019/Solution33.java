package chrishoonS.kakao2019;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution33 {
    public String[] solution(String[] record) {
        ArrayList<String> arr = new ArrayList();
        HashMap<String, String> map = new HashMap();
        for (int i = 0; i < record.length; i++) {
            String[] cmd = record[i].split(" ");

            if (cmd[0].equals("Enter")) {
                arr.add(cmd[1] + "님이 들어왔습니다.");
                map.put(cmd[1], cmd[2]);
            } else if (cmd[0].equals("Change")) {
                map.put(cmd[1], cmd[2]);
            } else {
                arr.add(cmd[1] + "님이 나갔습니다.");
            }
        }
        String[] answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            int idx = arr.get(i).indexOf("님");
            String id = arr.get(i).substring(0, idx);
            String[] temp = arr.get(i).split(" ");
            answer[i] = map.get(id) + "님이 " + temp[1];
        }
        return answer;
    }
}