class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        for(int i = 0; i < flowerbed.length-2; i++){

            if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i+2] == 0){
                n--;
                flowerbed[i+1] = 1;
            }
        }

        if(n > 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;

        Solution s1 = new Solution();
        s1.canPlaceFlowers(flowerbed, n);
    }

}