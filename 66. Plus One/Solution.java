class Solution {
    public static int[] plusOne(int[] digits) {
        
        if(digits[digits.length - 1] == 9){
            // System.out.println("If block");
            //Checking if all elements are 9
            int flag = 0, index = -1;
            for(int i = digits.length - 1; i >= 0 ; i--){
                // System.out.println("i = " + i);
                if(digits[i] != 9){
                    flag = 1;
                    index = i;
                    break;
                }
            }
            // System.out.println("flag = " + flag + " index = " + index);

            
            //all are 9
            if(flag == 0){
                int[] digits2 = new int[digits.length + 1];
                // System.out.println("flag is 0");
                digits2[0] = 1;
                for(int i = 1; i < digits2.length; i++){
                    digits2[i] = 0;
                }
                return digits2;
            }
            //not all are 9
            else{
                int[] digits2 = new int[digits.length];
                // System.out.println("Index = " + index);
                // System.out.println(digits[index]);
                digits[index] = digits[index] + 1;
                digits2[index] = digits[index];
                // System.out.println(digits[index]);

                // //Printing array
                // System.out.println("\nArray Now ");
                // for(int ch : digits2){
                //     System.out.print(ch + " ");
                // }

                //coping 1st part
                for(int i = 0; i < index; i++){
                    digits2[i] = digits[i];
                }

                // //Printing array
                // System.out.println("\nArray Now ");
                // for(int ch : digits2){
                //     System.out.print(ch + " ");
                // }

                //fill remaining with 0
                for(int i = index+1; i < digits2.length; i++){
                    digits2[i] = 0;
                }

                // //Printing array
                // System.out.println("\nArray Now ");
                // for(int ch : digits2){
                //     System.out.print(ch + " ");
                // }                

                return digits2;

                // digits2[index] = digits2[index] + 1;
                // System.out.println(digits2[index]);
                // for(int i = index + 1; i < digits2.length; i++){
                //     digits2[i] = 0;
                // }
            }

        }

        //Normal Condition
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
        
    }

    public static void main(String[] args) {
        
        // int[] digits = {4,3,2,1};
        // int[] digits = {1,2,3};
        int[] digits = {8,9,9,9};


        int[] answer = plusOne(digits);

        System.out.println("This is the answer ");
        for(int ch : answer){
            System.out.print(ch + " ");
        }
    }
}