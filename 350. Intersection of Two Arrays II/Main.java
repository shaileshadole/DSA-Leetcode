import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Main {
    public static int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        //Populating the hashmap
        for(int num : nums1){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        //Comparing it with the list
        for(int num : nums2){
            if(freq.containsKey(num) && freq.get(num) > 0){
                result.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }

        //Converting it into array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(intersect(nums1, nums2));


    }
}