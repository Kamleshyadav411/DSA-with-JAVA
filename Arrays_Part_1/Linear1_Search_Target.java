import java.util.*;



// Write a program of linear search with target ..

public class Linear1_Search_Target{
    public static int linear(int []arr, int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int [] arr={1,2,3,4,5,6};
        int target= 4;
        int index=linear(arr ,target);
        if(index== -1){
            System.out.println("not found");
        }else{
            System.out.println("found at index: "+ index);
        }
    }
}

