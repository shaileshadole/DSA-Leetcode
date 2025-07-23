import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        Integer[] array2 = new Integer[score.length];
        String[] answer = new String[score.length];
        for(int b = 0; b < score.length; b++){
            array2[b] = score[b];
        }
        
        //Sorting the array and store it in new array
        Arrays.sort(array2, Collections.reverseOrder());

        for(int i = 0; i < array2.length; i++){

            // int index = Arrays.binarySearch( array2, score[i]);
            int index = Arrays.asList(array2).indexOf(score[i]);

            // int index = Arrays.binarySearch(array2, score[i]);


            if(index == 0){
                answer[i] = "Gold Medal";
            }else if(index == 1){
                answer[i] = "Silver Medal";
            }else if(index == 2){
                answer[i] = "Bronze Medal";
            }else{
                answer[i] = String.valueOf(index + 1);
            }   
        }

        System.out.println("\n\n++++++++++++++++");
        for(String ch : answer){
            System.out.print(ch + " ");
        }
        System.out.println("\n++++++++++++++++");
              
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Hlelo");

        int[] score = {10,3,8,9,4};
        Solution s1 = new Solution();
        s1.findRelativeRanks(score);


    }
}