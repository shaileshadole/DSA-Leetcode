import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> stableMountains(int[] height, int threshold) {
        
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < height.length; i++){
            if(height[i - 1] > threshold){
                list.add(i);
            }
        }

        return list;

    }

    public static void main(String[] args) {
        System.out.println("hello");

        // int[] height = {1,2,3,4,5};
        int[] height = {10,1,10,1,10};
        int threshold = 10;

        System.out.println(stableMountains(height, threshold));
    }
}