package yeojin822.KAKAOBLINDRECRUITMENT2022;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * [92341] 주차 요금 계산
 */
public class Fee {
    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    Map<String,String> carIn;
    Map<String,Integer> times;
    public int[] solution(int[] fees, String[] records) throws ParseException {
        int[] answer;
        this.carIn = new HashMap<>();
        this.times = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");
            if(record[2].equals("IN")){
                carIn.put(record[1], record[0]);
            }else{
                carOut(record[1], record[0]);
                carIn.remove(record[1]);
            }
        }

        if(carIn.size() > 0){
           for( String key : carIn.keySet() ){
               carOut(key, "23:59");
           }
        }

        List<String> keyList = new ArrayList<>(times.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));
        answer = new int[times.size()];
        int index = 0;
        for (String key : keyList) {
            double total = times.get(key);
            if(total > fees[0]){
                answer[index] = fees[1] + (int)Math.ceil((total - fees[0]) / fees[2]) * fees[3];
            }else{
                answer[index] = fees[1];
            }
            index++;
        }

        return answer;
    }

    private void carOut(String car, String out) throws ParseException {
        Date inTime = format.parse(carIn.get(car));
        Date outTime = format.parse(out);
        long diff = (outTime.getTime() - inTime.getTime()) / (1000 * 60);
        times.put(car, times.getOrDefault(car, 0) + (int) diff);
    }
}
