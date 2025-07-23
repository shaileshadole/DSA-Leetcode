public class Main{
    
    public int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        if(target > nums[end]){
            return end + 1;
        }else if(target < nums[start]){
            return start;
        }

        while(start <= end){
            System.out.println("Start = " + start + " end = " + end + " mid = " + mid);
            mid = (start+end)/2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                break;
            }
            System.out.println("Start = " + start + " end = " + end + " mid = " + mid);
        }
        return mid;
    }
    
    public static void main(String[] args) {

        int nums[] =  {1,3};

        Main m1 = new Main();
        System.out.println(m1.searchInsert(nums, 2));
    }
}