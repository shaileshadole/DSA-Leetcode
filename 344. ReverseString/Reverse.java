public class Reverse{


    public void reverseString(char[] s) {
        
        char temp;
        for(int i = 0; i < s.length/2; i++){
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }

        System.out.println("\n\nReverse Array is : ");
        // Print the character array
        for (char c : s) {
            System.out.print(c);
        }
        

    }

    public static void main(String[] args) {
        
        // Convert string to character array
        char[] s = "Babbar".toCharArray();
        
        // Print the character array
        for (char c : s) {
            System.out.print(c);
        }



        Reverse rev = new Reverse();
        rev.reverseString(s);
    }

    
}