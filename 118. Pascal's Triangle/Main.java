// class Solution {
//     public List<List<Integer>> generate(int numRows) {
        
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static List<List<Integer>> generate(int numRows){
        
        List<List<Integer>> nestedList = new ArrayList<>();

        if(numRows == 0){
            return nestedList;
        }
        
        int[][] mothaArray = new int[numRows][];
        //Making arrays
        for(int i = 1; i <= numRows; i++){
            int[] array = new int[i];
            array[0] = 1;
            array[array.length - 1] = 1;

            //Filling the array
            for(int j = 1; j < array.length - 1; j++){
                array[j] = mothaArray[i-2][j - 1] + mothaArray[i-2][j];
            }

            mothaArray[i - 1] = array;
        }  
        
        //Converting 2D array to nested list
        for (int[] row : mothaArray) {
            List<Integer> innerList = new ArrayList<>();
            for (int element : row) {
                innerList.add(element);
            }
            nestedList.add(innerList);
        }
        
        System.out.println(nestedList);

        return nestedList;
    }
    public static void main(String[] args) {
        
        int n = 5;
        generate(n);    

    }
}





















// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Main{

//     public static List<List<Integer>> generate(int numRows){

//         List<List<Integer>> mothaArray = new ArrayList<>();
        
//         if(numRows == 0){
//             return mothaArray;
//         }
        

//         //Making arrays
//         for(int i = 1; i <= numRows; i++){
//             int[] array = new int[i];
//             array[0] = 1;
//             array[array.length - 1] = 1;

//             //Filling the array
//             for(int j = 1; j < array.length - 1; j++){
//                 array[j] = mothaArray.get(i - 2).get(j - 1) + mothaArray.get(i - 2).get(j);
//                 // array[j] = mothaArray[i-2][j - 1] + mothaArray[i-2][j];
//             }

//             mothaArray.set(i-1, Arrays.asList(array));
//             // mothaArray[i - 1] = array;
//         }  
        
//         System.out.println("Printing the motha array");
//         for(int i = 0; i < numRows; i++){
//             for(int ch : mothaArray[i]){
//                 System.out.print(ch + " ");       
//             }
//             System.out.println();
//         }

//         return mothaArray;
//     }
//     public static void main(String[] args) {
        
//         int n = 0;
//         generate(n);    

//     }
// }




















// public class Main{

//     public static int[][] generate(int numRows){

//         if(numRows == 0){
//             int[][] khaliArray = {}; 
//             return khaliArray;
//         }
        
//         int[][] mothaArray = new int[numRows][];

//         //Making arrays
//         for(int i = 1; i <= numRows; i++){
//             int[] array = new int[i];
//             array[0] = 1;
//             array[array.length - 1] = 1;

//             //Filling the array
//             for(int j = 1; j < array.length - 1; j++){
//                 array[j] = mothaArray[i-2][j - 1] + mothaArray[i-2][j];
//             }

//             mothaArray[i - 1] = array;
//         }  
        
//         System.out.println("Printing the motha array");
//         for(int i = 0; i < numRows; i++){
//             for(int ch : mothaArray[i]){
//                 System.out.print(ch + " ");       
//             }
//             System.out.println();
//         }

//         return mothaArray;
//     }
//     public static void main(String[] args) {
        
//         int n = 0;
//         generate(n);    

//     }
// }
























// // class Solution {
// //     public List<List<Integer>> generate(int numRows) {
        
// //     }
// // }

// public class Main{

//     public static int[][] generate(int numRows){
        
//         int[][] mothaArray = new int[numRows][];

//         //Making arrays
//         for(int i = 1; i <= numRows; i++){
//             // System.out.println("\ni = " + i);
//             int[] array = new int[i];
//             array[0] = 1;
//             array[array.length - 1] = 1;

//             // //Delte karjo he line
//             // if(i == 1 || i == 2){
//             //     mothaArray[i - 1] = array;
//             //     continue;
//             // }
            
//             // int[] compare = mothaArray[i-2];
//             // System.out.println("Printing Compare");
//             // for(int ch : compare){
//             //     System.out.print(ch + " ");       
//             // }
//             // System.out.println();

//             //FIlling the array
//             for(int j = 1; j < array.length - 1; j++){
//                 array[j] = mothaArray[i-2][j - 1] + mothaArray[i-2][j];
//             }

//             mothaArray[i - 1] = array;

//             // System.out.println("Printing the motha array");
//             // // for(int z = 0; z < numRows; z++){
//             //     for(int ch : mothaArray[i-1]){
//             //         System.out.print(ch + " ");       
//             //     }
//             //     System.out.println();
//             // // }
//         }
        
//         // System.out.println("Printing the motha array");
//         // for(int i = 0; i < numRows; i++){
//         //     for(int ch : mothaArray[i]){
//         //         System.out.print(ch + " ");       
//         //     }
//         //     System.out.println();
//         // }
        
        
        
        
        
        
        
//         // int[][] array2 = new int[4][3];
//         // return array2;

//         return mothaArray;
//     }
//     public static void main(String[] args) {
        
//         int n = 10;
//         generate(n);    

//     }
// }