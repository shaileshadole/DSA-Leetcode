import java.util.Arrays;

class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);

        int n = candyType.length / 2;
        int type = candyType[0];
        n--;

        for(int i = 1; i < candyType.length; i++){
            if(candyType[i] != type){
                n--;
                type = candyType[i];
            }

            if(n == 0){
                break;
            }
        }
    

        return (candyType.length / 2) - n;
    }

    public static void main(String[] args){
        
        int[] candyType = {45, 4, 4, 4, 4, 4};
        Solution s1 = new Solution();

        System.out.println(s1.distributeCandies(candyType));

    }
}