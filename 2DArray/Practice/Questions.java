//Print the number of 7’s that are in the 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} }
//output 2


import java.util.*;



// public class Questions{
//     public static void main(String args[]){
//         int [][] mat= {
//             {4,7,8},
//             {8,8,7}
//         };
//     int count=0;
//     int n =mat.length;
//     int m= mat[0].length;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(mat[i][j] == 7){
//                 count++;
//             }
//         }
        
//     }
//     System.out.println(count);
    
// }
    
    
// }







//Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.
// Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//output 18



public class Questions{
    public static void main(String args[]){
        int [][] mat= {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
    int sum=0;
    int m=mat[0].length;
    for(int i=0;i<m;i++){
        
            sum += mat[1][i];
        
        
    }
    System.out.println(sum);
    
}
    
    
}

