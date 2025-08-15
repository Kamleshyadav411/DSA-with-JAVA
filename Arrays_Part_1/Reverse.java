import java.util.*;




// Write a program for reverse an array.....
// Approach- Swapping...... 


public class Reverse{
    public static void reverse(int numbers[]){
        int start=0,last=numbers.length-1;
        while(start<last){
            //swap
            int temp = numbers[last];
            numbers[last]=numbers[start];
            numbers[start]=temp;
            start++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        reverse(numbers);

        //print array

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
