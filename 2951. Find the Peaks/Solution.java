import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> findPeaks(int[] mountain) {
        
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i < mountain.length - 1; i++){
            
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]){
                list.add(mountain[i]);
            }
        }

        return list;

    }

    public static void main(String[] args) {
        
        int[] mountain = {1,4,3,8,5};
        System.out.println(findPeaks(mountain));

    }
}