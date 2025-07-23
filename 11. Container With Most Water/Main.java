public class Main {
    public static int maxArea(int[] height) {
        
        int largestArea = Integer.MIN_VALUE;
        int s = 0, e = height.length - 1;

        while(e > s){

            int currArea = (e - s) * Math.min(height[e], height[s]);
            System.out.println(s + " : s");
            System.out.println(e + " : e");
            System.out.println((e - s) + " * " + Math.min(height[e], height[s]));

            if(currArea > largestArea){
                largestArea = currArea;
            }

            if(height[s+1] > height[e - 1]){
                s++;
            }else{
                e--;
            }

            System.out.println(currArea + " : Current Area");
            System.out.println(largestArea + " : Largest Area");

            System.out.println();
        }

        return largestArea;
    }


    public static void main(String[] args) {
        
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}