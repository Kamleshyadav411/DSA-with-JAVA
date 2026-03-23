import java.util.*;


public class counting{
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
            smallest = Math.min(smallest,arr[i]);
        }
        int count[]  = new int[largest - smallest +1];
        for(int i=0; i<arr.length;i++){    // yaha par mujhe original array pe iterate karna hai
            count[arr[i]-smallest]++;
        }
        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){  // yaha par frequency pr iterate kar rhe hai
            while(count[i]>0){
                arr[j] = i+smallest;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int arr[]={5,-4,-3,-2,-6};
        countingsort(arr);
        printArr(arr);
    }
}