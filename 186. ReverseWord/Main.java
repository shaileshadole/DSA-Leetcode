public class Main{
    public static void main(String args[]){
        
        String name = "My name is Mahesh";

        int a = 0, b = 0, temp, i, j, wordlength;
        int l = name.length();

        System.out.println(name.charAt(i));
    
    for(i = 0; i < l; i++){
        
        if(name.charAt(i) == ' '){
            
            b = i - 1;
            wordlength = b - a;
            
            for(j = 0; j < wordlength/2; j++){
                
                temp = name.charAt(a);
                name.charAt(a) = name.charAt(b);
                name.charAt(b) = temp;
                
                a++;
                b--;
            }
        }
        a = i + 1;
    }
        







    }
}