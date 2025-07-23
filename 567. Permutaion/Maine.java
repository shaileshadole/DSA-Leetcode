public class Maine {
    
    public boolean checkEqual(int a[], int b[]){
        for(int i = 0; i<26; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    } 

    public boolean checkInclusion(String s1, String s2){
        //character count array
        int count1[] = new int[26];

        for(int i = 0; i<s1.length(); i++){
            int index = s1.charAt(i) - 'a';
            count1[index]++;
        }

        //traverse s2 string in window of size s1 lenght and compare
        int i = 0;
        int windowSize = s1.length();
        int count2[] = new int[26];

        //running for the first window
        while(i<windowSize && i<s2.length() ){
            int index = s2.charAt(i) - 'a';
            count2[index]++;
            i++;
        }

        if(checkEqual(count1, count2)){
            return true;
        }   

        //aage window process karo
        while(i<s2.length()){

            char newChar = s2.charAt(i);
            int index = newChar - 'a';
            count2[index]++;

            char oldChar = s2.charAt(i - windowSize);
            index = oldChar - 'a';
            count2[index]--;

            i++;

            if(checkEqual(count1, count2)){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args){
        
        Maine m1 = new Maine();

        System.out.println(m1.checkInclusion("ab", "eidbaoo"));
    }
}

