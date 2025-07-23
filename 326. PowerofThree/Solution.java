

class Solution {
    public static boolean isPowerOfThree(int n) {

        for(int x=0; x<100; x++){
            System.out.println("Loop = " + x);
            if(Math.pow(3, x) == n){
                return true;
            }
            if(Math.pow(3, x) > n){
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 0;

        System.out.println(isPowerOfThree(num));
    }
}