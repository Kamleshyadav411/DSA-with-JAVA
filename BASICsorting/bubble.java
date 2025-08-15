import java.util.*;



// // Bubble sort......o(n^2)
// public class bubble{
//     public static void bubblesort(int arr[]){
//         for(int turn=0;turn<arr.length-1;turn++){  // outer loop count karta ki kitni baar loop ko chalana hai sorted karne ke liye
//             for(int j=0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                     // swap
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         bubblesort(arr);
//         printArr(arr);
//     }
// }











// Bubble sort......o(n) if array  is already sorted

public class bubble{
    public static void bubblesort(int arr[]){
        boolean swaps =false;
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    swaps=true;

                }
            }
            if(!swaps) break;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        bubblesort(arr);
        printArr(arr);
    }
}