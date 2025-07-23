class Solution {
    public static int peakIndexInMountainArray(int[] arr) {
        
        // int n = arr.length;

        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            System.out.println("Start : " + start);
            System.out.println("End : " + end);
            System.out.println("Mid : " + mid);
            System.out.println();

            //Peak was found
            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]){
                return mid;
            }

            //Decreasing Valley
            if(arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]){
                end = mid - 1;
            }
            
            //Increasing valley
            if(arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]){
                start =  mid + 1;
            }
        }  
        return 0; 
    }

    public static void main(String[] args) {
        // int[] arr = {0,10,5,2};
        int[] arr = {1, 2, 3, 14, 17, 15, 12};

        System.out.println(peakIndexInMountainArray(arr));
    }
}