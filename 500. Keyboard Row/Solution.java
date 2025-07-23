import java.util.ArrayList;

public class Solution{

    public static String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        //Iterating to whole question
        for(int i  = 0; i < words.length; i++){
            int flag = 1;
            int row = 1;

            //Finding the right row
            for(int j = 0; j < 3; j++){
                System.out.println("j = " + j);
                if(keyboard[j].contains(String.valueOf(Character.toLowerCase(words[i].charAt(0))))){
                    row=j;
                    break;
                }
            }

            //Cheking if all characters exist in that row
            for(int k = 0; k < words[i].length(); k++){
                if(!keyboard[row].contains(String.valueOf(Character.toLowerCase(words[i].charAt(k))))){
                    flag = 0;
                    break;
                }
            }

            if(flag == 1){
                list.add(words[i]);
            }
        }

        return list.toArray(new String[0]);
    }


    public static void main(String[] args) {
        
        String[] words = {"Hello","Alaska","Dad","Peace"};
        findWords(words);
    }
}