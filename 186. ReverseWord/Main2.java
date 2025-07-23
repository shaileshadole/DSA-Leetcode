public class Main2 {
    public static void main(String[] args) {
        
        // char[] name = "My name is Pheonix";

        String name = "My name is Pheonix";

        System.out.println(name);

        int a = 0, b = 0, i, j, wordlength;
        int l = name.length();
        char temp;

        char[] array = name.toCharArray();

        for(i = 0; i < l; i++){

            if(array[i] == ' '){
                
                System.out.println("Space wali Condition at i = " + i);
                b = i - 1;
                wordlength = b - a;

                for(j = 0; j < (wordlength/2); j++){

                    temp = array[a];
                    array[a] = array[b];
                    array[b] = temp;

                    a++;
                    b--;

                    System.out.println("Gelo");

                }

            }
            a = i + 1;
        }

        
        System.out.println("\n\n&&&&&&&&");
        System.out.println(array);


    }
}
