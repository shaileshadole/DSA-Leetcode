class Main {
    public int compress(char[] chars) {
        
        int array[] = new int[26];
        String str = "";

        //Populating the array 26 lenght wala
        for(int i = 0; i<chars.length; i++){
            int index = chars[i] - 'a';
            array[index]++; 
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

        //Final Array
        int count = 0;
        char[] finalArray = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            finalArray[i] = str.charAt(i);
            count++;
        }

        //printing the array
        System.out.println("\n\n***Printing the Final array");
        for(char aj : finalArray){
            System.out.print(" [" + aj + "]");
        }
        return count;
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','b','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'};

        Main s1 = new Main();
        System.out.println("\n");
        System.out.println(s1.compress(chars));
    }
}