public class Main2{
    
    public static int lengthgm = 0;
    public static int condition = 0;

    public static String removeOccurrences(String s, String part) {
        
        char[] array = s.toCharArray();
        lengthgm = array.length;
        char[] sub = part.toCharArray();

        for(int i = 0; i<lengthgm; i++) {

            for(int km = 0; km < sub.length; km++){
                if(array[i+km] == sub[km]){
                    condition++;
                }
            }

            System.out.println("Condition = " +  condition);
            System.out.println("I = " + i);
            
            if( condition == sub.length ){

                System.out.println("condition satisfied at i = " + i);
                int zm = 0;

                for(int z = 0; z < array.length; z++){
                    
                    //because aapan zm++3 kelana (to prevent outofbound)
                    if(z == lengthgm - sub.length){
                        break;
                    }
                            
                    if(z == i){
                        zm = zm + sub.length;
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

                lengthgm = lengthgm - sub.length;
                System.out.println("lengthgm = " + lengthgm);
                
                // //condition
                // condition = 0;

                //Resetting the loop to check from the start
                i = -1;
            }

            //condition
            condition = 0;
        }

        System.out.println("\n\n\n\n\n************");
        System.out.println("Final answer is ");
        String answer = new String("");
        for(int i = 0; i<lengthgm; i++){
            answer = answer + array[i];
        }
        System.out.println("Answer : " + answer);
        return " ";
    }
    
    public static void main(String[] args) {
        
        // String s = "zzabczaabcbc";
        String s = "axxxxyyyyb";
        String part = "xy";



        removeOccurrences(s, part);
    }
}