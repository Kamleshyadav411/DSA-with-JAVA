import java.util.*;


// Basic binary code... for understanding


public class Binary_Search_Basics{
    public static int bs(int arr[], int key){
        int start =0;
        int end=(arr.length-1);
        while(start <= end){
            int mid=(start+end)/2;
            if( arr[mid]== key){
                return mid;
            }
            if(arr[mid]< key){              // right
                start = mid+1;   
            }else{                      //left
                end = mid -1; 
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,5,6,7,8,9};
        int key = 2;
        int index = bs(arr,key);
        System.out.println(index);
    }
}


