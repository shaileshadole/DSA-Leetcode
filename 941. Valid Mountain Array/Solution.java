class Solution {
    public static boolean validMountainArray(int[] arr) {
        
        //mountain should at least of 3 int
        if(arr.length < 3){
            return false;
        }

        int i = 0;

        while(i < arr.length - 1 && arr[i + 1] > arr[i]){
            System.out.println("Loop 1 i = " + i);
            i++;
        }
        while(i < arr.length - 1 && arr[i + 1] < arr[i]){
            System.out.println("Loop 2 i = " + i);
            i++;
        }

        if(i == arr.length - 1){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println("Hello");

        int[] arr = {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}