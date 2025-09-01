class Solution2 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> one = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int sum = Integer.MAX_VALUE;

        //Filling the hashmap
        for(int i = 0; i < list1.length; i++){  
            one.put(list1[i], i);
        }

        for(int i = 0; i < list2.length; i++){
            if(one.containsKey(list2[i])){
                int indexSum = i + one.get(list2[i]);
                if(sum > indexSum){
                    sum = indexSum;
                    ans.clear();
                    ans.add(list2[i]);
                }else if(sum == indexSum){
                    ans.add(list2[i]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}