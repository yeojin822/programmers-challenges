package yeojin822.KAKAOBLINDRECRUITMENT2019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * [42890] 후보키
 */
public class CandidateKey {
    boolean[] visited;
    int len;
    int cnt;
    Set<String> list = new HashSet<>();
    List<String> list2= new ArrayList<>();
    public int solution(String[][] relation) {
        int answer = 0;

        len = relation[0].length;
        cnt = relation.length;
        visited = new boolean[len];


        for(int i=1;i<=len;i++){
            dfs(0,i,relation);
            unique(relation);
            list.clear();
        }
        return list2.size();
    }

    public void dfs (int start,int r,String[][] relation){
        if(r==0){
            String temp="";
            for(int i=0;i<len;i++){
                if(visited[i]){
                    temp+=i;
                }
            }
            list.add(temp);
        }
        for(int i=start;i<len;i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(start+1,r-1,relation);
                visited[i]=false;
            }
        }
    }

    public void unique(String[][] relation){
        //유일성 판단하기
        for(String data:list){
            String[] temp= data.split("");
            int[] arr=new int[temp.length];
            for(int i=0;i<temp.length;i++){
                int c =Integer.parseInt(temp[i]);
                arr[i]=c;
            }
            //유일성 판단하기위한 set
            Set<String> set = new HashSet<>();
            for(int i=0;i<cnt;i++){
                String cdd="";
                for(String data2:temp){
                    int c =Integer.parseInt(data2);
                    cdd+=relation[i][c];
                }
                set.add(cdd);
            }
            //만약 유일하다면 최소성 검사
            if(set.size()==cnt){
                boolean flag=false;
                for(String data3:list2){
                    int cnt=0;
                    String[] temp3= data3.split("");
                    for(String data4:temp3){
                        if(data.contains(data4)){
                            cnt++;
                        }
                    }
                    if(cnt==data3.length()){
                        flag=true;
                    }
                }
                if(!flag){
                    list2.add(data);
                }
            }
        }
    }
}
