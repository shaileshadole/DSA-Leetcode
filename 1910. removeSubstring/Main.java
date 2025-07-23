public class Main{
    
    public static int lengthgm = 0;

    public static String removeOccurrences(String s, String part) {
        
        char[] array = s.toCharArray();
        lengthgm = array.length;
        char[] sub = part.toCharArray();

        for(int i = 0; i<lengthgm; i++) {
            
            if(array[i] == sub[0] && array[i+1] == sub[1] && array[i+2] == sub[2] ){

                System.out.println("I found at i = " + i);
                int zm = 0;

                for(int z = 0; z < array.length; z++){
                    
                    //because aapan zm++3 kelana (to prevent outofbound)
                    if(z == lengthgm - 3){
                        break;
                    }
                            
                    if(z == i){
                        zm = zm + 3;
                    }

                    System.out.println("z = " + z);
                    System.out.println("zm = " + zm);
                    array[z] = array[zm];
                    zm++;

                    System.out.println("&&&&&&&&&");
                    for(char ch : array){
                        System.out.print(ch);
                    }
                    System.out.println("\n$$$$$$$$$$\n\n");
                    
                }

                System.out.println("\n\n\nAt i = " + i);
                for(char ch : array){
                    System.out.print(ch + " ");
                }
                System.out.println();

                lengthgm = lengthgm - 3;
                System.out.println("lengthgm = " + lengthgm);

                //Resetting the loop to check from the start
                i = 0;
            }
        }
        
        return " ";
    }
    
    public static void main(String[] args) {
        
        String s = "zzabczaabcbc";
        String part = "abc";



        removeOccurrences(s, part);
    }
}