class Solution {
    public int maxProduct(int n) {
        
        int max1 = 1;
        int max2 = 1;

        while(n > 0){
            
            int digit = n % 10;
            if(digit > max1 && digit > max2){
                max1 = digit;
            }else if(digit < max1 && digit > max2){
                max2 = digit;
            }
            n = n / 10;
        }

        return max1 * max2;
    }

    public static void main(String[] args) {
        
        int n = 31;
        // int n = 124;
        Solution s1 = new Solution();
        System.out.println(s1.maxProduct(n));
    }
}