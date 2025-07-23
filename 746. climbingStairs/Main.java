public class Main{
    
    public static int solve(int[] cost, int n, int[] dp){
        
        //base Case
        if(n == 0){
            // return cost[0];
            return dp[0];
        }
        if(n == 1){
            // return cost[1];
            return dp[1];
        }

        if(dp[n] == -1){
            dp[n] = cost[n] + Math.min(solve(cost, n - 1, dp), solve(cost, n - 2, dp));

            System.out.println("\n\nNow the DP array is updated");
            for(int ch : dp){
                System.out.print(ch + " ");
            }
        }

        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;

        //array
        int[] dp = new int[n];

        //initialised with -1
        for(int i = 0; i < n; i++){
            dp[i] = -1; 
        }

        dp[0] = cost[0];
        dp[1] = cost[1];
        
        return Math.min(solve(cost, n-1, dp), solve(cost, n - 2, dp));
    }
    
    public static void main(String[] args) {
        
        
        int[] cost = {1,100,1,1,1,100,1,1,100,1};

        Main m1 = new Main();

        System.out.println(m1.minCostClimbingStairs(cost));


    }
}