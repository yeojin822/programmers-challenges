package chrishoonS.summer_winter_2018;

class Solution11 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String str : skill_trees){
            String tmpSkill = str;

            for (int i = 0; i < str.length(); i++) {
                String s = str.substring(i, i+1);
                if(!skill.contains(s))
                    tmpSkill = tmpSkill.replace(s, "");
            }
            if(skill.indexOf(tmpSkill) == 0) answer++;
        }

        return answer;
    }
}