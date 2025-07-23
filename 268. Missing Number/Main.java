public class Main {
    
    public static void solution(int[] nums){

        quickSort(nums, 0, nums.length - 1);

        
    }













    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(nums, start, end);
            
            quickSort(nums, start, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start - 1; 

        for (int j = start; j < end; j++) {
            if (nums[j] < pivot) {  
                i++;
                swap(nums, i, j);
            }
        }
        
        swap(nums, i + 1, end);
        return i + 1;  
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        solution(nums);
    }
}
