import java.util.*;




// Write a program for finding largest and smallest element in array..


public class Largest_And_Smallest{
    public static int largestN(int arr[]){
        int largest= Integer.MIN_VALUE; // -infinity
        int smallest= Integer.MAX_VALUE;  

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("smallest value is: " +smallest);
        return largest;
    }
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,5};
        System.out.println("largest value is :" + largestN(arr));
    }
}