class Solution {
    public static double myPow(double x, int n) {
        
        //base case
        if(n == 1){
            return x;
        }
        if(n == 0){
            return 1;
        }

        //handling negative
        if(n < 0){
            return (1/myPow(x, (-1)*n));
        }

        double halfpower = myPow(x, n/2);

        if(n % 2 == 0){
            return halfpower * halfpower;
        }else{
            return halfpower * halfpower * x;
        }
    }

    public static void main(String[] args) {
        System.out.println("heloo");

        double x = 2.0;
        int n = -3;
        // double x = 2.10000;
        // int n = 3;

        System.out.println(myPow(x, n));

    }

}