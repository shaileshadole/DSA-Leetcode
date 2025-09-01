//Naive Solution/Brute force (my first solution)
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        List<String> ans = new ArrayList<>();
        int sum = Integer.MAX_VALUE;
        
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i].equals(list2[j])){
                    // System.out.println("\ni : " + i);
                    // System.out.println("j : " + j);
                    if((i + j) < sum){
                        sum = i + j;
                        ans.clear();
                        ans.add(list1[i]);
                    }else if(i + j == sum){
                        ans.add(list1[i]);
                    }
                    // System.out.println(ans);
                    break;
                }
            }
        }

        // System.out.println(ans);
        return ans.toArray(new String[0]);
    }
}