class Solution {
    public int findLHS(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        //Filling the hashmap
        for(int ch : nums){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        //main logic
        for(Integer key : map.keySet()){
            if(map.containsKey(key+1)){
                max = Math.max(max, map.get(key) + map.get(key+1));
            }
        }

        return max;
    }
}