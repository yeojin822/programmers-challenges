package yeojin822.SummerWinterCoding2018;

/**
 * [49993] 스킬트리
 */
public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (int i = 0; i < skill_trees.length; i++) {
            for (int j = 0; j < skill.length(); j++) {
                skill_trees[i] = skill_trees[i].replaceAll(String.valueOf(skill.charAt(j)), String.valueOf((j+1)));
            }
            skill_trees[i] = skill_trees[i].replaceAll("[^\\d]", "");
            if(skill_trees[i].length() == 0)answer++;
        }

        for (int i = 0; i < skill_trees.length; i++) {
            for (int j = 0; j <  skill_trees[i].length(); j++) {
               if(Integer.parseInt(String.valueOf(skill_trees[i].charAt(j))) != (j+1)){
                   skill_trees[i] = "";
                   break;
               }
            }
            if(skill_trees[i].length() > 0){
                answer++;
            }
        }


        return answer;
    }
}
