class Main {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i = 0, j = 0, k = 0;
        int[] copy = new int[nums1.length + nums2.length]; 

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                copy[k++] = nums2[j++];
            }else{
                copy[k++] = nums1[i++];
            }
        }

        //If first array is remaining
        while (i < nums1.length) {
            copy[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            copy[k++] = nums2[j++];
        }

        //Printing the array
        System.out.println("\n\nPrinting the array");
        for (int z  = 0; z < copy.length; z++){
            System.out.print(copy[z] + " ");
        }
        
        if(copy.length % 2 == 0){
            System.out.println("\n\nEven");
            System.out.println(copy[copy.length/2] );
            System.out.println(copy[copy.length/2 - 1] );
            return ((double)copy[copy.length/2] + (double)copy[(copy.length/2) - 1]) / 2;
        }

        return copy[copy.length / 2];
    }

    public static void main(String[] args){

        int[] nums1 = {1,2, 5};
        int[] nums2 = {3,4};

        System.out.println("\n\n");
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}