class Main {
    public static int maxProfit(int[] prices) {
        
        // int currdiff = 0, maxdif = Integer.MIN_VALUE;
        // int n = prices.length;

        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n; j++){
        //         currdiff = prices[j] - prices[i];
        //         System.out.println("i = " + i + " j = " + j + " diff = "  + currdiff);
        //         maxdif = Math.max(maxdif, currdiff);
        //     }
        // }

        // return maxdif;




        int minPrice = Integer.MAX_VALUE, currProfit = Integer.MIN_VALUE, highestProfit = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){         
            currProfit = prices[i] - minPrice;
            highestProfit = Math.max(highestProfit, currProfit);
            minPrice = Math.min(minPrice, prices[i]);

            System.out.println("CP " + currProfit + " HP = " + highestProfit + " minPrice = " + minPrice);
        }

        return highestProfit;
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}