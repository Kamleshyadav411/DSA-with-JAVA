import java.util.*;


// Creation of 2D matrix...

public class Creation_2D{
    public static void main(String args[]){
        int matrix[][] = new int[3][4];
        int n = matrix.length, m = matrix[0].length; // n and m is number of rows and cols..

        Scanner s= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= s.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}



