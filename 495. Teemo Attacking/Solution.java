class Solution {
    public static int findPoisonedDuration(int[] timeSeries, int duration) { 
        int total = 0;
        for(int i = 0; i < timeSeries.length; i++){
            if(i == timeSeries.length - 1){
                total = total + duration;
                break;
            }
            total = total + Math.min((timeSeries[i+1] - timeSeries[i]), duration);
        }
        
        return total;
    }


    public static void main(String[] args) {
        // System.out.println("hello");

        int[] timeSeries = {1,4};
        int duration = 2;
        System.out.println(findPoisonedDuration(timeSeries, duration));
    }

}