import java.util.*;



// Write a program of linear search with target ..

public class linear_searchwithallidx{
    public static void main(String args[]){
        int  [] arr = {1,2,3,4,4};
        int target = 4;
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("found at  = " +i);
                found = true;
            }
            }
            if(! found){
                System.out.println("not found");
        }
        
    }
}
    