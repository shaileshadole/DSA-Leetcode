class Solution {
    public int compress(char[] chars) {
        
        int array[] = new int[26];
        String str = "";

        //Populating the array 26 lenght wala
        for(int i = 0; i<chars.length; i++){

            int index = chars[i] - 'a';
            array[index]++; 
        }

        //printing the array
        System.out.println("\n\n***Printing the array");
        for(int aj : array){
            System.out.print(" " + aj);
        }

        //String bharne
        for(int j = 0; j < 26; j++){
            if(array[j] != 0){
                char ch = (char) ('a' + j);
                str = str + ch;
                
                //1 aala t hatva
                if(array[j] == 1){
                    continue;
                }

                str = str + array[j];
            }
        }

        System.out.println("\nHere is your string " + str);

        String newStr = ""; 
        int count = 0;
        for(int k = 0; k< str.length(); k++){
            if(str.charAt(k) == '1'){
                continue;
            }

            newStr = newStr + str.charAt(k);
            count++;
        }

        //Final Array
        char[] finalArray = new char[newStr.length()];

        System.out.println("New String " + newStr);
        
        for(int i = 0; i<newStr.length(); i++){
            finalArray[i] = newStr.charAt(i);
        }

        //printing the array
        System.out.println("\n\n***Printing the Final array");
        for(char aj : finalArray){
            System.out.print(" [" + aj + "]");
        }

        
        System.out.println("\n\n\n.");
        System.out.println(count);
        
        return count;
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','b','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'};

        Solution s1 = new Solution();
        System.out.println(s1.compress(chars));
    }
}