public class Main {


    public boolean palindrome(String str){
        
        System.out.println("Original " + str);
        // Remove non-alphanumeric characters, remove spaces, and convert to lowercase
        String clean = str.replaceAll("[^a-zA-Z0-9]", "")  // Remove symbols
                           .replaceAll("\\s", "")          // Remove spaces
                           .toLowerCase();                 // Convert to lowercase

        
        System.out.print("Clean : ");
                           System.out.println(clean);  

        for(int i = 0; i < clean.length() ; i++){
            if(clean.charAt(i) != clean.charAt(clean.length() - i - 1)){
                return false;
            }

        }
        return true;
        
        
    }

    public static void main(String[] args) {
        // String str = "a57$*hh HJ 3lK";
        // String str = "Noon";
        String str = "c1 0$d@eeD 01c";

        Main shailesh = new Main();
        System.out.println(shailesh.palindrome(str));
    }
}
