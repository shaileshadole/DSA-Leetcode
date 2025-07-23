class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }

        int n = x, digit, reverse=0;
        while(n!=0){
            digit = n%10;
            reverse = reverse * 10 + digit;
            n=n/10;
        }

        if(reverse == x){
            return true;
        }        
        return false;
    }
}



public class Main{
    public static void main(String[] args) {
        System.out.println("Hello");

        Solution lucky = new Solution();
        System.out.println(lucky.isPalindrome(-1013101));

    }
}