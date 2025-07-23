
class Solution {
    public static int longestMountain(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }

        int i = 1, length = 0;
        while(i < arr.length - 1){

            //Check if the array is the peak
            if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                int left = i - 1;
                int right = i + 1;

                while(left > 0 && arr[left - 1] < arr[left]){
                    left--;
                }

                while(right < arr.length - 1 && arr[right] > arr[right + 1]){
                    right++;
                }

                length = Math.max(length, right - left + 1);

                //Skipping the uneccesary checks
                i = right;
            }else{
                i++;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        
        
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        System.out.println(longestMountain(arr));
    }
}