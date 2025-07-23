public class Dp {
    
    public static int solve (int nStairs, int i){

        //base case
        if(i == nStairs){
            return 1;
        }
        if(i > nStairs){
            return 0;
        }

        return solve(nStairs, i+1) + solve(nStairs, i+2);
    }
    
    
    public static void main(String[] args) {
        
        int nStairs = 5;
        System.out.println(solve(nStairs, 0));
    }
}
