class Main {
    public static char kthCharacter(int k) {
        
        String initial = "a";
        String newWord = "";

        while(initial.length() <= k){
            for(int i = 0; i < initial.length(); i++){
                newWord =  newWord + (char)(initial.charAt(i) + 1);
            }   

            initial = initial + newWord;
            newWord = "";
        }

        System.out.println(initial);
        int z = 0;
        while(z < initial.length()){
            System.out.println(z+" -> "+initial.charAt(z));
            z++;
        }

        System.out.println(initial.charAt(k));

        return initial.charAt(k - 1);  
    }

    public static void main(String[] args) {
        
        int k = 5;
        kthCharacter(k);
    }
}