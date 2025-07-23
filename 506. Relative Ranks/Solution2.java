import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Solution2 {
    public String[] findRelativeRanks(int[] score) {

        String[] answer = new String[score.length];
        HashMap<Integer, Integer> scoreToRank = new HashMap<>();

        //Populating the Hashmap
        for(int j = 0; j < score.length; j++){
            scoreToRank.put(score[j], j);
        }

        //Sorting the original Array
        Arrays.sort(score);

        //Building the answer
        for(int i = score.length - 1; i >= 0; i--){

            int originalIndex = scoreToRank.get(score[i]);
            
            if(i == score.length - 1){
                answer[originalIndex] = "Gold Medal";
            }else if(i == score.length - 2){
                answer[originalIndex] = "Silver Medal";
            }else if(i == score.length - 3){
                answer[originalIndex] = "Bronze Medal";
            }else{
                answer[originalIndex] = String.valueOf(score.length - i);
            }
        }

        System.out.println("\n\n++++++++++\nThis is the answer");
        for(String ch : answer){
            System.out.print(ch + " ");
        }
        System.out.println("\n++++++++");
              
        return answer;
    }

    public static void main(String[] args) {
        int[] score = {10,3,8,9,4};
        Solution2 s1 = new Solution2();
        s1.findRelativeRanks(score);
    }
}