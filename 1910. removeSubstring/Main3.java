public class Main3{
    
    public static int lengthgm = 0;
    public static int condition = 0;

    public static String removeOccurrences(String s, String part) {
        
        //Converting both strings to array
        char[] array = s.toCharArray();
        lengthgm = array.length;
        char[] sub = part.toCharArray();



        for(int i = 0; i<lengthgm; i++) {

            //Checking for the condition
            for(int km = 0; km < sub.length; km++){
                if(array[i+km] == sub[km]){
                    condition++;
                }
            }
            
            if( condition == sub.length ){

                int zm = 0;

                for(int z = 0; z < array.length; z++){
                    
                    //because aapan zm++3 kelana (to prevent outofbound)
                    if(z == lengthgm - sub.length){
                        break;
                    }
                        
                    //required position var zm samor kara
                    if(z == i){
                        zm = zm + sub.length;
                    }

                    array[z] = array[zm];
                    zm++;   
                }

                //length kami kara array chi
                lengthgm = lengthgm - sub.length;
                System.out.println("lengthgm = " + lengthgm);

                i = -1;
            }

            //condition punha zero kar
            condition = 0;
        }

        String answer = new String("");
        for(int i = 0; i<lengthgm; i++){
            answer = answer + array[i];
        }
        return answer;
    }
    
    public static void main(String[] args) {

        String s = "axxxxyyyyb";
        String part = "xy";
        removeOccurrences(s, part);
    }
}