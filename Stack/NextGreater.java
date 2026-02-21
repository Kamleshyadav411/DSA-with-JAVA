import java.util.*;

public class NextGreater {
    public static void main(String args[]){  //O(n)
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int NxtGreater[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i-- ){
            //while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            } 
            //if-else
            if(s.isEmpty()){
                NxtGreater[i] = -1;
            }else{
                NxtGreater[i]= arr[s.peek()];
            }

            //push in s
            s.push(i);
        }
        for(int i=0 ; i<NxtGreater.length; i++){
            System.out.print(NxtGreater[i]+ " ");
        }
        System.out.println();
    }
}


//next greater right
//next greater left
//next smaller right
//next smaller left