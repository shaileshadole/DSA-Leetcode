public class Main {
   
    public static boolean flag = false;
    public static String name = "";

    public static void printPerm(String str, String permutation){

        if(str.length() == 0){
            if(name.contains(permutation)){
                flag = true;
            }

            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }

    public boolean checkInclusion(String s1, String s2) {
        
        name = s2;
        printPerm(s1, "");

        if(flag)
        return true;

        return false;
    }
 

    public static void main(String[] args) {

        Main m1 = new Main();
        System.out.println(m1.checkInclusion("ab", "eidboaoo"));
    }
}
