// class Solution {
//     public static int findContentChildren(int[] g, int[] s) {
     
        
//         int i = 0, j = 0, reserve = s[j];
//         j++;

//         while(j < s.length && i < g.length){
            
//             if(reserve < g[i]){
//                 reserve += s[j++];
//             }else if(reserve == g[i]){
//                 j++; 
//                 i++;
//                 reserve = 0;
//             }else{
//                 reserve = reserve + (s[j] - g[i]);
//                 i++;
//             }
//         }



//         return i; 
//     }

//     public static void main(String[] args) {

//         // int[] g = {1,2,3};
//         // int[] s = {1,1};

//         int[] g = {1,2}, s = {1,2,3};
        
//         System.out.println(findContentChildren(g, s));
//     }
// }

class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        int i = 0, j = 0, reserve = s[j];
        j++;
        
        System.out.println("Initial reserve: " + reserve);
        
        while (j < s.length && i < g.length) {
            System.out.println("\nBefore condition check: i = " + i + ", j = " + j + ", reserve = " + reserve);
            
            if (reserve < g[i]) {
                System.out.println("reserve (" + reserve + ") is less than g[" + i + "](" + g[i] + "), adding s[" + j + "](" + s[j] + ")");
                reserve += s[j++];
            } else if (reserve == g[i]) {
                System.out.println("reserve (" + reserve + ") equals g[" + i + "](" + g[i] + "), incrementing i and j, resetting reserve");
                j++;
                i++;
                reserve = 0;
            } else {
                System.out.println("reserve (" + reserve + ") is greater than g[" + i + "](" + g[i] + "), distributing extra");
                reserve = reserve + (s[j] - g[i]);
                i++;
            }
            System.out.println("After condition check: i = " + i + ", j = " + j + ", reserve = " + reserve);
        }

        System.out.println("\nTotal content children: " + i);
        return i;
    }

    public static void main(String[] args) {
        int[] g = {1, 2}, s = {1, 2, 3};
        System.out.println("Result: " + findContentChildren(g, s));
    }
}
